import java.util.Scanner;

public class C2 {

	public static boolean isPositive(int num){
		if(num>=0)
			return true;
		else
			return false;
	}
	
	public static void printFiveStars(){
		System.out.println("*****");
	}
	
	public static void printNameAndDate(String name, String date){
		System.out.println("Hello "+name+",\nToday is "+ date);
	}


	public static void trianglePerimeter (double side1, double side2, double side3){
		if (triangleValid(side1,side2,side3)==true)
			System.out.println("The perimeter is: "+ (side1+side2+side3));
		else 
			System.out.println("The triangle is invalid!");
	}

	public static boolean triangleValid(double side1, double side2, double side3){
		if ((side1+side2>=side3) && (side1+side3>=side2) && (side2+side3>=side1))
			return true;
		return false;
	}


	public static void main(String[] args) {
		//-----------------------Testing isPositive method----------------
		System.out.println("is 7 positive? " + isPositive(7));
		System.out.println("is -7 positive? " + isPositive(-7));
		//-----------------------Testing printFiveStars method----------------
		printFiveStars();
		//-----------------------Testing printNameAndDate method---------------
		printNameAndDate("David", "14.2.015");
		//-----------------------Testing trianglePerimeter method---------------
		double side1,side2,side3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 sides of the triangle");
		side1=scan.nextDouble();
		side2=scan.nextDouble();
		side3=scan.nextDouble();
		trianglePerimeter ( side1, side2, side3);

	}
}
