public class BigNumber {
 private IntNode head;
 
 public BigNumber(BigNumber other)
 {
  if(other == null) 
   this.head = new IntNode(0,null);
  else
   copy(other.head);
 }
 public BigNumber(String num)
 {
  boolean numbers = true;
  if(num.length() < 1) 
  {
   this.head = new IntNode(0,null);
   return;
  }
  if(num.charAt(0) > 47 && num.charAt(0) < 58)
  {
   this.head = new IntNode(Character.getNumericValue(num.charAt(0)),null);
   for(int i=1; i < num.length() && numbers; i++)
   {
    if(num.charAt(i) > 47 && num.charAt(i) < 58)
     addFirst(Character.getNumericValue(num.charAt(i)));
    else
    {
     this.head = new IntNode(0,null);
     numbers = false;
    }
   }
  }
  else
   this.head = new IntNode(0,null);
 }
 public BigNumber add(BigNumber other)
 {
  IntNode b1,b2;
  BigNumber add = new BigNumber(this);
  b1 = add.head;
  b2 = other.head; 
  while(b1 != null)
  {
   if(b2!=null)
   {
    b1.setNum(b1.getNum()+b2.getNum());
    b2= b2.getNext();
   }
   b1 = b1.getNext();
  }
  
  while(b2 != null)
  {
   add.addEnd(b2.getNum());
   b2= b2.getNext();
  }
  
  add.fix();
  
  return add;
 }
 public BigNumber add(long n)
 {
  String s= Long.toString(n);
  return add(new BigNumber(s));
 }
 public BigNumber plusplus()
 {
  return new BigNumber(this).add(1);
 }
 
 public BigNumber multiply(BigNumber other) 
 {
  IntNode b1;
  BigNumber mult = new BigNumber("0");
  for(b1 = this.head; b1!=null; b1 = b1.getNext())
  {
    mult = new BigNumber(mult.add(multOneDigit(other,b1.getNum())));
    other.addFirst(0);
  }
  mult.checkZero();
  return mult;
 }
 public BigNumber mult(long n) 
 {
  String s= Long.toString(n);
  return multiply(new BigNumber(s));
 }
 private void addEnd(int n)
 {
  IntNode p;
  for(p = this.head; p.getNext()!=null; p = p.getNext());
  IntNode temp = new IntNode(n, null);
  p.setNext(temp);
 }
 private void addFirst(int n)
 {
  this.head = new IntNode(n, head);
 }
 public String toString()
 {
  String s= ""; 
  IntNode p;
  for(p = this.head; p!=null; p = p.getNext())
   s = Integer.toString(p.getNum()) + s;
  return addComaa(s);
 }
 private String addComaa(String s)
 {
  String str ="";
  int printAfter = 0, count =0;
  if(s.length() % 3 == 0 )
   printAfter = 3;
  if(s.length() % 3 == 1 )
   printAfter = 1;
  if(s.length() % 3 == 2 )
   printAfter =2 ;
  for(int i = 0; i < s.length() ;i++)
  {
   str += s.charAt(i);
   count ++;
   if(count == printAfter && i < s.length()-1 )
   {
    str+= ",";
    count =0;
    printAfter = 3;
   }
  }
  return str;
 }
 private void copy(IntNode other)
 {
  if(other.getNext() != null)
   copy(other.getNext());
  else
  {
   this.head = new IntNode(other.getNum(), null);
   return;
  }
  addFirst(other.getNum());  
 }
 public BigNumber multOneDigit(BigNumber b,int num)
 {
  BigNumber temp = new BigNumber(b);
  IntNode p;
  for(p = temp.head; p!=null; p = p.getNext())
   p.setNum(p.getNum()* num);
  temp.fix();
  return temp;
 }
 private void fix()
 {
  IntNode p;
  int cury =0,sum;
  for(p = this.head; p!=null; p = p.getNext())
  {
   sum= p.getNum() + cury;
   if(sum > 9)
   {
    p.setNum(sum % 10);
    cury =sum / 10;
   }
   else
   {
    p.setNum(sum);
    cury = 0;
   }
  }
  if(cury == 1)
   this.addEnd(1);
  
 }
 private void checkZero()
 {
  IntNode p;
  for(p = this.head; p!=null; p = p.getNext())
   if(p.getNum() != 0)
    return;
  this.head = new IntNode(0,null);
 }
}
