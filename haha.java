
	import java.util.Scanner;
	public class haha { 
		public static void main(String[] args) {
			int num;
			Scanner scan = new Scanner(System.in);
			System.out.print("Please enter a number:");
			num = scan.nextInt(); 
	      		   if (num < 100000 && num > 99) {   // 3 until 5 digits
	      			   
	      			   if (num > 999 && num < 10000) {  // 4 digits
	      				   int firstDigit = num / 1000;			       // x***
	    				   int secondDigit = (num / 100) % 10;         // *x**
	      				   int thirdDigit = (num / 10) % 10;           // **x*
	      				   int lastDigit = num % 10;			       // ***x
	      				 
	      				   if (firstDigit == lastDigit && secondDigit == thirdDigit)		// If the first and last digits are equal, and the middle digits. (Palindrome number)	
	      						System.out.println("The number" +" "+ num +" "+"is an Palindrome number ");   
	      					else    
	  			   				System.out.println("The number" +" "+ num +" "+"is not a Palindrome.");    
	      			   }
	      			   
	      			   if (num > 9999 && num < 100000) {  // 5 digits
	      				   int firstDigit = num / 10000;	             // x****
	      				   int secondDigit = (num / 1000) % 10;          // *x***
	      				   int fourthDigit = (num / 10) % 10;            // ***x*
	      				   int lastDigit = num % 10;                     // ****x
	      				 
	      				   if (firstDigit == lastDigit && secondDigit == fourthDigit)	// If the first and last digits are equal, and the middle digits. (Palindrome number)
	      						System.out.println("The number" +" "+ num +" "+"is an Palindrome number ");   
	      					else    
	  			   				System.out.println("The number" +" "+ num +" "+"is not a Palindrome.");   
	      			   }
	      			   
	      		   		if (num >99 && num<1000 ) { // 3 digits
	      		   				int firstDigit = num / 100;	// x**
	      		   				int secondDigit = (num / 10) % 10; // *x*
	      		   				int lastDigit = num%10;			// **x
	      		   				int newnum = (firstDigit*firstDigit*firstDigit) + (secondDigit*secondDigit*secondDigit) + (lastDigit*lastDigit*lastDigit); // first Digit^3 + second Digit^3 + lastDigit^3 (Armstrong number)
	      			   			
	      		   				if (num==newnum)  //If the given number is "Armstrong number"
	      			   					System.out.println("The number" +" "+ num +" "+"is an Armstrong number ");   
	      			   				else  
	      			   					System.out.println("The number" +" "+ num +" "+"is not a Armstrong number ");   
	      		   								}      
	      		   }
	      		   
	      		   else // invalid number
	      			   
	      			 System.out.println("The number" +" "+ num +" "+ "is invalid.");  
	      			 
	      		   
		}
	}


