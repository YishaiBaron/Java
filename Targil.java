
public class Targil {
	public static void main (String args[])   {
//printSquare(8);	
//printEmptySquare(4);	
		//printTriangle(6);
	//	System.out.println(isDigitInside(17328, 8));
	//	int[] arr = {-7,83,8,7,6,9,10};
		//System.out.println(maxDifference(arr));
	//	System.out.println(howManyEven(arr));
		char[] arrc = {'a','b','c','A'};
		System.out.println(allLetters(arrc));
	}
	public static void printSquare(int length){
		for (int row = 0; row < length; row++) {
			for (int cow = 0; cow < length; cow++) {
				System.out.print("*");
			}
		System.out.println();
	}
	}
	public static void printEmptySquare(int length){
		for (int row = 0; row < length; row++) {
			for (int cow = 0; cow < length; cow++) {
				if(row == 0 || row == length - 1 || cow == 0 || cow == length - 1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void printTriangle(int length){
		for (int row = 0; row < length; row++) {
			for (int col = 0; col < row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
		public static boolean isDigitInside(int num, int digit){
			while (num>0) {
				if (num % 10 == digit)
						return true;
				num/=10;
			}
			
			return false;
		}
		public static int maxDifference(int arr[]) {
			int max = arr[0];
			int min = arr[0];
	for (int i=1; i<arr.length; i++){
		if(arr[i] > max)
			max = arr[i];
		if(arr[i] < min)
			min = arr[i];
	}
			return max - min;
			
		}
		public static int howManyEven(int arr[]){
			int c= 0;
		for (int i=1; i<arr.length; i++){
			if (arr[i]/2*2 == arr[i])
				c++;
		
		}
		return c;
			
		}

		public static boolean allLetters(char arr[]){
			for (int i = 0; i < arr.length; i++) {
				if(isLetter(arr[i]) == false)// equals to: if(!isLetter(arr[i]))
					return false;
			}
			
			return true;
		}
		private static boolean isLetter(char c1){
			if( c1 >= 'a' && c1 <= 'z' || c1 >= 'A' && c1 <= 'Z')
				return true;
			return false;
		}
		}

	
	
	
