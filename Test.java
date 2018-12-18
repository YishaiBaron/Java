
public class Test {

	public static void main(String[] args) {
		
		
		// == Tester for 1 ==
		System.out.println("\n\n \t\t == Tester for 1 == \n\n");
		
		System.out.println("Supposed to print 6 ===> " +Ex8.howManyEven(2202444));
		System.out.println("Supposed to print 4 ===> " +Ex8.howManyEven(2324574));
		System.out.println("Supposed to print 0 ===> " +Ex8.howManyEven(1));
		System.out.println("Supposed to print 0 ===> " +Ex8.howManyEven(0));
		System.out.println("Supposed to print 1 ===> " +Ex8.howManyEven(135792));
		System.out.println();
		
		
		// == Tester for 2 ==
		System.out.println("\n\n \t\t == Tester for 2 == \n\n");
		int[] a = {19,1,3,0,4,9,7,9,12,12,14,12,13,1,3};
		System.out.println("Supposed to print 1 ===> " + Ex8.longestAscending(a));
		
		int[] b = {0,1,3,0,4,9,7,9,12,12,14,12,13,1,3};
		System.out.println("Supposed to print 7 ===> " +Ex8.longestAscending(b));
		
		int[] c = {1};
	System.out.println("Supposed to print 1 ===> " +Ex8.longestAscending(c));
		
		int[] d = {4,7,3,2,7,9,10,4};
		System.out.println("Supposed to print 4 ===> " + Ex8.longestAscending(d));
		
		int[] e = {0,1,1,0,4,4,4,4,4,4,14,12,13,1,3,90};
		System.out.println("Supposed to print 5 ===> " + Ex8.longestAscending(e));
		
		int[] f = {1,2,3,1};
		System.out.println("Supposed to print 3 ===> " + Ex8.longestAscending(f));
		
		// == Tester for 3 ==
		System.out.println("\n\n \t\t == Tester for 3 == \n\n");
		
		a = new int[1];
		b = new int[6];
		c = new int[3];
		d = new int[9];
		e= new int[12];
		
		
		for(int i = 0; i < a.length;i++)
			a[i]=(int)(Math.random() * 200);
		for(int i = 0; i < b.length;i++)
			b[i]=(int)(Math.random() * 200);
		for(int i = 0; i < c.length;i++)
			c[i]=(int)(Math.random() * 200);
		for(int i = 0; i < c.length;i++)
			c[i]=(int)(Math.random() * 200);
		for(int i = 0; i < d.length;i++)
			d[i]=(int)(Math.random() * 200);
		for(int i = 0; i < e.length;i++)
			e[i]=(int)(Math.random() * 200);
		
		bubbleSort(a);
		bubbleSort(b);
		bubbleSort(c);
		bubbleSort(d);
		bubbleSort(e);
		
		print(a); 
		print(b); 
		System.out.println();
		print(Ex8.merge(a, b));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(a, b)) + "\n");
		print(a); 
		print(c); 
		System.out.println();
		print(Ex8.merge(a, c));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(a, c))+ "\n");
		print(e); 
		print(d); 
		System.out.println();
		print(Ex8.merge(e, d));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(e, d))+ "\n");
		print(a); 
		print(e); 
		System.out.println();
		print(Ex8.merge(a, e));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(a, e))+ "\n");
		print(b); 
		print(b); 
		System.out.println();
		print(Ex8.merge(b, b));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(b, b))+ "\n");
		print(e); 
		print(d); 
		System.out.println();
		print(Ex8.merge(e, d));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(e, d))+ "\n");
		print(c); 
		print(b); 
		System.out.println();
		print(Ex8.merge(c, b));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(c, b))+ "\n");
		print(b); 
		print(d); 
		System.out.println();
		print(Ex8.merge(b, d));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(b, d))+ "\n");
		print(d); 
		print(a); 
		System.out.println();
		print(Ex8.merge(d, a));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(d, a))+ "\n");
		print(e); 
		print(a); 
		System.out.println();
		print(Ex8.merge(e, a));
		System.out.println("\t Supposed to print true ===> " +ole(Ex8.merge(e, a))+ "\n");
		
		
		// == Tester for 4 ==
		System.out.println("\n\n \t\t == Tester for 4 == \n\n");
		
		String s1= "abcd(1234%^^3";
		String s2 ="AbCD(1234%^^3";
		System.out.println("Supposed to print true ===> " +Ex8.equalIgnoreCase(s1, s2));
		
		s1= "abcd(1234%^^2";
		s2 ="AbCD(1234%^^3";	
		System.out.println("Supposed to print false ===> " +Ex8.equalIgnoreCase(s1, s2));
		
		s1= " ";
		s2 =" ";	
		System.out.println("Supposed to print true ===> " +Ex8.equalIgnoreCase(s1, s2));
	}
	public static boolean ole(int[] a)
	{
		for(int i = 1; i < a.length;i++)
			if(a[i] < a[i-1])
				return false;
		return true;
	}
	public static void bubbleSort(int[] a) {
	    for(int i = a.length -1; i > 0; i--)
	    	for(int j = 0; j < i; j++)
	    		if(a[j] > a[j+1])
	    			swap(a, j, j+1);
	}
	public static void swap(int[] a, int index1, int index2) {
	    int temp = a[index1];
	    a[index1] = a[index2];
	    a[index2] = temp;
	}
	public static void print(int[] a)
	{
		System.out.print("[");
		for(int i=0;i < a.length-1 ; i++)
			System.out.print(a[i] + "|");
		System.out.print(a[a.length -1] + "] - ");
	}
}
