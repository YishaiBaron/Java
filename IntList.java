

public class IntList {
	private static IntNode head;

	public IntList() { head = null; }


	public void add(int n)	{
		head = new IntNode(n, head);
	}

public void addToEnd(int n){
IntNode temp = new IntNode(n, null);
	if (head == null) head =  temp;

else
{
	IntNode p = head;
	for(p=head; p.getNext() != null; p = p.getNext());
	p.setNext(temp);
}
	

}
public static int position(int n)
{
	IntNode p = head;
	int c = 1;
	while (p!=null && p.getNum()!=n)
	{
		p= p.getNext();
		c++;
	}
	if (p==null)
		return -1;
	return c;
}
public static void remove(int n)
{
	IntNode p, prev;
	p = head;
	prev = null;
	while(p != null && p.getNum() != n)
	{
		prev = p;
		p=p.getNext();
	}
	if(p != null)
	{
		if(prev == null)
		   head = head.getNext();
		else
		   prev.setNext(p.getNext());
	}
	

}


public void merge(IntList other){
	IntNode p1, p2, prev;
	p1 = this.head;
	p2 = other.head;
	prev = null;
	
	while(p1 != null && p2 != null)
	{
		//we didn't find where to insert p2.getValue()
		if(p2.getNum() > p1.getNum())
		{
			prev = p1;
			p1 = p1.getNext();
		}
		//this is the position for p2.getValue()
		else
		{
			IntNode temp = new IntNode(p2.getNum(), p1);
			//in case we want to add an element before "this.head"
			if(p1 == head)
			{
				head = temp;
			}
			//all other cases
			else
			{
				prev.setNext(temp);
			}
		}
	}
	//if "other" list still has elements, they should be inserted after the last element of "this" list
	if(p2 != null)
	{
		while(p2 != null)
		{
			IntNode temp = new IntNode(p2.getNum(), null);
			//in this phase, prev is on the last element of "this" list
			prev.setNext(temp);
			prev = prev. getNext();
		}
	}
		
	
			


}

public static void print(){
	IntNode t;
	for (t = head; t!=null; t=t.getNext())
	System.out.print(t.getNum()+"--> ");
}
public static void reverse()
{
	IntNode rev, curr;
	rev= null;
	curr = head;
	while (curr!=null)
	{
		head = head.getNext();
		curr.setNext(rev);
		rev = curr;
		curr = head;
	}
head = rev;
}
public static int maxSection(){
	{
	  int max = 0, count = 0; 
	  int curr = head.getNum();
	  IntNode p = head;
	  while(p != null)
	  {
	     if(p.getNum() == curr)
	     {
		count++;
		p = p.getNext();
	     }
	     else 
	     {
	       if(count > max)
	    	max = count;
	       count = 0;
	       curr = p.getNum();
	      }
	     }
	     if(count > max)
	        max = count;
	     return max;   
}}
private static void printReverse(IntNode p)
{
   if(p != null)
   {
      printReverse(p.getNext());
      System.out.print(p.getNum() + " ");
   }
}
private static IntNode copyBigger(int n, IntNode p) {
	if( p == null)
	return null;
	IntNode t = copyBigger(n, p.getNext());
	if (p.getNum()>=n)
		t= new IntNode(p.getNum(), t);
	return t;
	   

}

   /*public static void main(String args[]){
	IntList list = new IntList();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	System.out.println(position(1));// counter
	print();
	System.out.println();
	reverse();
	print();
	System.out.println();
	remove(51);
	print();
	System.out.println();
	System.out.println(maxSection());
	printReverse(head);
	System.out.println();
IntNode t = null;
t = new IntNode(1, t);
t = new IntNode(2, t);
t = new IntNode(3, t);
t = new IntNode(4, t);
t = new IntNode(5, t);
IntNode e;
for (e = copyBigger(2,t); e!=null; e=e.getNext())
{
	System.out.print(e.getNum());
}
IntList v = new IntList();
v.add(6);
v.add(4);
v.add(2);
System.out.println();	

merge(v);*/
 

}




