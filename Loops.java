// Yishai Baron 308396761
public class Loops {
	// 	The method returns the number of digits in the number
	private static int digitsCounter (int n)  {
		int c = 0;     //c = counter
		int temp = n;     
		while (temp > 0)  {
			temp = temp / 10;  
			c++;	}  			
		return c;
}
	// The method returns the sum of the digits that number
	private static int digitsSum (int n, int d) {
		int sum = 0;
		int temp;
		while (n != 0) {
			temp = n % 10;
			sum = sum + temp;
			n = n / 10;
		}
		return sum;
	}
// The method parameter in a positive integer n and returns its unique double, if any.
	public static int specialMult(int n) { 
		int num = n;
		int counter = digitsCounter(n);
		boolean smult = false;    
		boolean value = false;
				
	int i = 1;   
	if (n < 10)
		return n;
	else if (n == 11)
		return 0;
	if (counter == 2) { value = true;}
	else for (int j = 3; !value; j++, i = i * 10) {
		if (counter==j) 
			value = true;
	}
	for (int k = i; !smult; k++){
		num = n + (k * 100);
		if (num % n == 0 && digitsSum (num,counter)==n)
			smult= true;
	}
	return num;
	}
	// The method parameter in a positive integer n
	// and prints the special double all the numbers from 1 to n inclusive.
	public static void printAllSpecialMult(int n) {
		for (int x = 1; x <= n; x++)  {
			System.out.println(x +"\t" +specialMult(x));
		}}
	//The method accepts parameters positive integer n and a number d.
	//The system will print the number n When after all d digits (from right) 
	//will appear in a comma.
	public static void printWithComma(int n, int d) {
		int temp;
		int h = (digitsCounter (n) / d); //h = how many times
		int space = d * h;
		if (n > 0 || d > 0) { //Checking if it's legal
			for (int i = 0; i < h; i++, space = space-d){
				temp= n / (int) Math.pow(10, space);
				if (temp !=0) 
					System.out.print(temp + ",");
				n = n% (int)Math.pow(10, space);
			}
			if (n!=0)
				System.out.print(n);
		
	}
	else System.out.print(n);
	}

}