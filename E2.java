import java.util.Arrays;

/**
 * Goal : Solutions for Marton Questions 
 * Date : 1/2/2017 
 * Author: Ilan Peretz [ilanpe@post.jce.ac.il , http://my.jce.ac.il/~ilanpe ]
 */
public class E2
{
    public static void main(String[] args)
    {
	// check Q1
	int[] a = { 2, 0, 1, 4};
	System.out.println(Arrays.toString(a));
	System.out.println("Missing num: " + getMissingNum(a));

	System.out.println("=========================================");

	// check Q2
	System.out.println("myPower(2,10): " + myPower(2, 10));

	System.out.println("=========================================");

	// check Q3
	int[] b = { 0, 0, 1, 1, 1, 2, 2, 4, 4, 4, 4, 5 };
	System.out.println(Arrays.toString(b));
	System.out.println("howMany(1): " + howMany(b, 1));

	System.out.println("=========================================");

	// check Q8
	double[] c = {1.3, 5.2, 6.0, 7.1, 9.8, 12.3, 14.55};
	System.out.println(Arrays.toString(c));
	System.out.println("getClosest(4.5): " + getClosest(c, 4.5));
	
    }

    // solution for Q1 from Maraton
    public static int getMissingNum(int[] a)
    {
	int requestSum = a.length * (a.length + 1) / 2;
	int itemsSum = 0;

	for (int i = 0; i < a.length; i++)
	    itemsSum = itemsSum + a[i];

	return requestSum - itemsSum;
    }

    // solution for Q2 from Maraton in O(log n)
    // x,y>=0
    public static int myPower(int x, int y)
    {
	if (y == 0)
	    return 1;

	int tmp = myPower(x, y / 2);

	if (y % 2 == 0)
	    return tmp * tmp;
	return tmp * tmp * x;
    }

    // solution for Q3 from Maraton (part1)
    public static int howMany(int[] a, int x)
    {
	int last = findLast(a, x);
	if (last == -1)
	    return 0;
	return last - findFirst(a, x) + 1;
    }

    // solution for Q3 from Maraton (part2)
    private static int findFirst(int[] a, int x)
    {
	int low = 0, high = a.length - 1, mid;

	while (low <= high)
	{
	    mid = (low + high) / 2;

	    if (a[mid] == x && (mid == 0 || a[mid - 1] != x))
		return mid;

	    if (x > a[mid])
		low = mid + 1;
	    else
		high = mid - 1;
	}
	return -1;
    }

    // solution for Q3 from Maraton (part3)
    private static int findLast(int[] a, int x)
    {
	int low = 0, high = a.length - 1, mid;

	while (low <= high)
	{
	    mid = (low + high) / 2;
	    if (a[mid] == x && (mid == a.length - 1 || a[mid + 1] != x))
		return mid;

	    if (x >= a[mid])
		low = mid + 1;
	    else
		high = mid - 1;
	}
	return -1;
    }

    // solution for Q8 from Maraton.
    public static int getClosest(double a[], double x)
    {
	if(x < a[0]) // check if x small then min item  
	    return 0;
	
	if(x > a[a.length-1]) // check if x big then max
	    return a.length-1;
	
	// start binSearch
	int high = a.length - 1, low = 0, mid;
	while (low <= high)
	{
	    mid = (high + low) / 2;
	    
	    if (a[mid] == x)
		return mid;
	    
	    if (x > a[mid])
		low = mid+1;
	    else
		high = mid-1;
	}

	// x between a[low] and a[high]
	if (Math.abs(a[low] - x) < Math.abs(a[high] - x))
	    return low;
	return high;
    }
    /**
     * Goal  : IntList - Linked List 
     * Date  : 1/2/2017
     * Author: Ilan Peretz [ ilanpe@post.jce.ac.il , http://my.jce.ac.il/~ilanpe ]
     */
    public class IntList
    {
        private IntNode head;

        public IntList()
        {
    	head = null;
        }

        public IntList(int[] arr)
        {
    	head = new IntNode(arr[0], null);
    	IntNode p = head;
    	for (int i = 1; i < arr.length; i++)
    	{
    	    p.setNext(new IntNode(arr[i], null));
    	    p = p.getNext();
    	}
        }

        // remove all x from list
        public void removeAll(int x)
        {
    	IntNode p = head, prev = null;

    	while (p != null)
    	{
    	    if (p.getNum() == x)
    	    {
    		// check if first
    		if (prev == null) // <=> if(p==head)
    		    head = p.getNext();
    		else
    		    prev.setNext(p.getNext());
    	    }
    	    else
    		prev = p;
    	    p = p.getNext();
    	}
        }

        // print reversed list - recursive version
        public void printReverse()
        {
    	printReverse(head);
        }
        private void printReverse(IntNode p)
        {
    	if(p != null)
    	{
    	    int num = p.getNum();
    	    printReverse(p.getNext());
    	    System.out.print(num + " ");
    	}
        }

        // Solution for Q5 form Maraton 2017
        public void compress()
        {	
    	// recursive compress
    	compress(head);

//    	// iterative compress
//    	IntNode p = head;
//    	if(p==null)
//    	    return;
//    	while (p.getNext() != null)
//    	{
//    	    if (p.getNum() == p.getNext().getNum())
//    		p.setNext(p.getNext().getNext());
//    	    else
//    		p = p.getNext();
//    	}
        }

        // recursive solution Q5 form Maraton 2017
        public void compress(IntNode p)
        {	
    	if(p == null || p.getNext() == null)
    	    return;
    	
    	if (p.getNum() == p.getNext().getNum())
    	    p.setNext(p.getNext().getNext());
    	else
    	    p = p.getNext();
    	compress(p);
        }

        // toString - recursive version
        private String toString(IntNode p)
        {
    	if (p == null)
    	    return "";
    	if (p.getNext() == null)
    	    return p.getNum() + "";
    	return p.getNum() + " -> " + toString(p.getNext());
        }

        // reverse the list
        public void reverse() 
        {
        	IntNode p1=head, p2=null, p3=null;
        	while(p1 != null)
        	{
        		p2 = p1.getNext();
        		p1.setNext(p3);
        		p3 = p1;
        		p1 = p2;
        	}
        	head = p3;
        }

        public String toString()
        {
    	return "[" + toString(head) + "]";

    	// iterative version
    	// String str = "[";
    	// IntNode p = head;
    	// 
    	// if(p != null)
    	// {
    	// 	while(p.getNext() != null)
    	// 	{
    	// 		str = str + p.getNum() + " -> ";
    	// 		p = p.getNext();
    	// 	}
    	// 	str = str + p.getNum();
    	// }
    	// str = str + "]";
    	//
    	// return str;
        }
    }
    

}

