//Yishai Baron 308396761
// ------Ex9-------

public class Ex9 {

	public static boolean isSwapEqual(int[] a, int[] b)
	{
		if (a.length == b.length) //
				return (swap(a, b ,0));
		
		else 	return false;
	}
	private static boolean swap(int[] a,int[] b, int i) {
		if(i==a.length) return true; //final indexes
		if (a[i]==b[i] || a[i]==b[b.length-1-i]) return swap(a, b, i+1); //recursion
		else 	return false;
	}
	
	//**************************************

	public static void printAllBinary(int n) {
		if (n>=1)	{
System.out.println(convert(n,0)); 
		}
else System.out.println ("Invalid number");
	}
	
	private static String convert(int n, int i){
			if (i<Math.pow(2,n)) {
				 String format="%0"+n+"d"; //% [forces numerical values to be zero-padded] [width] [decimal integer] 
				    System.out.printf(format,Integer.valueOf(Integer.toBinaryString(i)));
				    System.out.print(" ");
				    return convert(n, i+1); //recursion
			}
	return "";
	}
	
	//**************************************
	
	public static void printSubs(String s) {
	method(s,"");
		}
	private static void method(String s, String temp) {
if (s.length() == 0)  {
	System.out.println(temp);
	      return;
				}
else
method(s.substring(1), temp+ s.substring(0, 1));
method(s.substring(1), temp);
		}
			
		 		

	

	
	
	
}
