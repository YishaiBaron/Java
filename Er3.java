import java.util.Scanner;


public class Er3 {

	public static int[] cowsAndBulls(int[] origin, int[] guess){

		int[] cowsOrBulls = new int[4];
		int bullsCounter = 0 , cowsCounter = 0;
		for (int i = 0; i < origin.length ;  i++) {
			if (origin[i] == guess[i])
				bullsCounter++;
			}
		cowsOrBulls[0] = bullsCounter;
		cowsOrBulls[1] = cowsCounter;
		return cowsOrBulls;
	}


	public static int[] intoArray(int number){

		int digits = 0;

		while (number != 0){
			digits++;
			number /= 10;
		}

		int[] arr = new int[digits];

		for (int i = digits-1 ; i >= 0 ; i--){
			arr[i] = number %10;
			number /= 10;
		}
		return arr;

	}
	public static boolean appearsOnce(int[] origin){

		if (origin.length != 4)
			return false;

		int index0 = origin[0], index1 = origin[1], index2 = origin[2], index3 = origin[3];

		if ( index0 == 0 || index0 == index1 || index0 == index2 || index0 == index3 || index1 == index2 || index1 == index3|| index2 == index3){
			return false;
		}
		return true;
	}
	public static void main(String[] args) {

		int[] origin;
		do {

			int randomNum = (int)(Math.random()*9000) + 1000;

		 origin = intoArray(randomNum);
		}

		while (appearsOnce(origin) == false);


		Scanner scan = new Scanner(System.in);

		int[] cowsAndBullsReturn = {0,0};

		System.out.println("Please enter your 4 digits number for the game: ");

		//int[] guess;

		int userInput = scan.nextInt();

		int []guess = intoArray(userInput);

		while (appearsOnce(guess) == false){

			System.out.println("Your guess is not valid, please enter a different guess: ");

			userInput = scan.nextInt();

			guess = intoArray(userInput);
		}


		if (appearsOnce(guess) == true){
			cowsAndBullsReturn = cowsAndBulls (guess,origin);
			System.out.println("You got "+ cowsAndBullsReturn[0] +" Bulls" + " And  "+ cowsAndBullsReturn[1]+ " Cows.");
		}

		while (cowsAndBullsReturn[0] !=4 )
              System.out.println(" Welldone! your guess is 100% correct! ");

			//		int[] origin;
			//		do {
			//
			//			int randomNum = (int)(Math.random()*9000) + 1000;
			//			
			//			origin = intoArray(randomNum);u
			//		}
			//		
			//		while (appearsOnce(origin) == false);
			//


//			System.out.println(Arrays.toString(intoArray(userInput)));
//
//			System.out.println(appearsOnce(guess));
//
//			System.out.println(Arrays.toString(cowsAndBulls(origin, guess)));
//
//			System.out.println("origin" + Arrays.toString(origin));


		}



	}