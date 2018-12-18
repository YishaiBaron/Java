import java.awt.print.Printable;

public class Tester {
	  public static int mystery(TreeNode t)
	  {
	   int a = 0;
	   int b = 0;
	   if(t.getLeftSon() != null)
	   a = 1 + mystery(t.getLeftSon());
	   if(t.getRightSon() != null)
	   b = 1 + mystery(t.getRightSon());
	   if(a>b)
	   return a;
	   return b;
	  }
	  public static void pre(TreeNode t)
	    {
		if (t != null)
		{
		    System.out.print(t.getKey() + " ");
		    pre(t.getLeftSon());
		    pre(t.getRightSon());
		}
	    }
	    // סריקה בסדר תוכי
	    public static void in(TreeNode t)
	    {
		if (t != null)
		{
		    in(t.getLeftSon());
		    System.out.print(t.getKey() + " ");
		    in(t.getRightSon());
		}
	    }
	    public static int numLeaves(TreeNode t)
	    
	    {
		if (t == null)
		    return 0;

		if (t.getLeftSon() == null && t.getRightSon() == null) // is a leaf
		    return 1;
		
		return numLeaves(t.getLeftSon()) + numLeaves(t.getRightSon());
	    }
  public static void main(String[] args) {

		  /// Shai Tester

		TreeNode tree = new TreeNode(1,new TreeNode(7, null, null),new TreeNode(3, new TreeNode(5, null, null), null));
		
		System.out.print("pre order: ");
		pre(tree);
		
		System.out.println();
		
		System.out.print("in order: ");
		in(tree);
		System.out.println();
		System.out.println("numLeaves=" + numLeaves(tree));
		 
		//  System.out.println("\n\n \t\t == Shai Tester == \n\n");
		 
		 
		 
		 
		 
		 
		 
		/* 
	    System.out.println("Your printing:");
		    BigNumber n = new BigNumber("123");
		    System.out.println(n);
		    n = n.plusplus();
		    System.out.println(n);
		    BigNumber n2 = new BigNumber(n);
		    n2 = n.add(n2);
		    System.out.println(n2);
		    n2 = n2.add(1568);
		    System.out.println(n2);
		    n = n.multiply(n2);
		    System.out.println(n);
		    System.out.println("Supposed to print: \n 123 \n 124 \n 248 \n 1,816 \n 225,184");

		  
		    System.out.println("\n\n \t\t == My Tester == \n\n");
		     // My Tester
		    // Tester for BigNumber(BigNumber other) 
		    
		  System.out.println("\n\n \t\t == Tester for BigNumber(BigNumber other) == \n\n");
		  
		  BigNumber n111 = null;  
		  BigNumber n222 = new BigNumber(n111);
		  
		  System.out.println("Supposed to print 0 ===> " +  n222 + " work good");
		  
		  BigNumber n2222 = new BigNumber("1");
		  BigNumber n2223 = new BigNumber(n2222);
		  System.out.println("Supposed to print 1 ===> " + n2223);
		 
		  
		  
		  
		     // Tester for BigNumber(String num) 
		    
		  System.out.println("\n\n \t\t == Tester for BigNumber(String num) == \n\n");
		  
		  BigNumber n3 = new BigNumber("12345678");
		  System.out.println("Supposed to print 12,345,678 ===> " + n3);
		  
		  BigNumber n31 = new BigNumber("1234567");
		  System.out.println("Supposed to print 1,234,567 ===> " + n31);
		  
		  BigNumber n32 = new BigNumber("123456");
		  System.out.println("Supposed to print 123,456 ===> " + n32);
		  
		  BigNumber n33 = new BigNumber("0");
		  System.out.println("Supposed to print 0 ===> " + n33);
		  
		  BigNumber n34 = new BigNumber("123");
		  System.out.println("Supposed to print 123 ===> " + n34);
		  
		  BigNumber n30 = new BigNumber("");
		  System.out.println("Supposed to print 0 ===> " + n30);
		  
		  BigNumber n1 = new BigNumber("1n2343785643785268439");
		  System.out.println("Supposed to print 0 ===> " + n1);
		  
		  BigNumber n26 = new BigNumber("n12343785643785268439");
		  System.out.println("Supposed to print 0 ===> " +  n26);
		  
		  
		  
		    //Tester for add(BigNumber other)
		  
		  System.out.println("\n\n \t\t == Tester for add(BigNumber other) == \n\n");
		  
		  BigNumber n5 = new BigNumber("123");
		  BigNumber n6 = new BigNumber("19");
		  System.out.println("Supposed to print 142 ===> " +  n5.add(n6));
		  
		  
		  BigNumber n7 = new BigNumber("984787123498");
		  BigNumber n8 = new BigNumber("8743856001906");
		  System.out.println("Supposed to print 9,728,643,125,404 ===> " +  n7.add(n8));
		  
		  BigNumber n77 = new BigNumber("984787123498");
		  BigNumber n88 = new BigNumber("874385600190");
		  System.out.println("Supposed to print 1,859,172,723,688 ===> " +  n77.add(n88));
		  
		  BigNumber n9 = new BigNumber("0");
		  BigNumber n10 = new BigNumber("19");
		  System.out.println("Supposed to print 19 ===> " +  n9.add(n10));
		  
		  BigNumber n11 = new BigNumber("99999999");
		  BigNumber n12 = new BigNumber("99");
		  
		  System.out.println("Supposed to print 100,000,098 ===> " +  n11.add(n12));
		  
		  
		  
		  
		    //Tester for add(long n)
		  
		  
		  System.out.println("\n\n \t\t == Tester for add(long n) == \n\n");
		  
		  BigNumber n13 = new BigNumber("1123");
		  System.out.println("Supposed to print 1,131 ===> " +  n13.add(8));  
		  
		  BigNumber n133 = new BigNumber("1123");
		  System.out.println("Supposed to print 1,123 ===> " +  n133.add(0)); 
		   
		  BigNumber n1334 = new BigNumber("4556");
		  System.out.println("Supposed to print 4,556 ===> " +  n1334.add(-343254)); 
		  
		  
		  
		  
		    // Tester for plusplus()
		  
		  System.out.println("\n\n \t\t == Tester for plusplus() == \n\n");
		  
		  BigNumber n14 = new BigNumber("19");
		  BigNumber n15 = new BigNumber("99999999");
		  BigNumber n16 = new BigNumber("0");
		  
		  System.out.println("Supposed to print 20 ===> " + n14.plusplus());
		  System.out.println("Supposed to print 100,000,000 ===> " + n15.plusplus());
		  System.out.println("Supposed to print 1 ===> " + n16.plusplus());
		  System.out.print("checking aliasin: ");
		  System.out.println("Supposed to print 0 ===> " + n16);
		  
		  
		  
		  
		  
		     //Tester for multiply(BigNumber other)
		  
		  System.out.println("\n\n \t\t == Tester for multiply(BigNumber other) == \n\n");
		  
		 
		  BigNumber n343 = new BigNumber("123");
		  BigNumber n3433 = new BigNumber("12");
		  System.out.println("Supposed to print 1,476 ===> " + n343.multiply(n3433));
		  
		  BigNumber n61 = new BigNumber("0");
		  BigNumber n62 = new BigNumber("1223423234212343421342345");
		  System.out.println("Supposed to print 0 ===> " + n61.multiply(n62));
		  
		  BigNumber n64 = new BigNumber("5653254233413");
		  BigNumber n63 = new BigNumber("1223423234212343421342345");
		  System.out.println("Supposed to print 6,916,322,578,066,754,663,283,012,246,410,773,485 ===> " + n64.multiply(n63));
		  
		  
		  
		  
		     //Tester for mult(long n)
		  
		  System.out.println("\n\n \t\t == Tester for mult(long n) == \n\n");
		  
		  BigNumber n34333 = new BigNumber("12");
		  System.out.println("Supposed to print 1,476 ===> " + n34333.mult(123));
		  
		  BigNumber n622 = new BigNumber("1223423234212343421342345");
		  System.out.println("Supposed to print 0 ===> " + n622.mult(0));
		*/
		 }


}

