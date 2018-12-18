// Yishai Baron 308396761
import java.util.Scanner;
public class A2 {
public static int[] CowsAndBulls (int[]origin, int[] guess)
{
	int bull = 0,cow = 0;// Bull counter from the start
	int[] cbArr= new int[2]; 
	for (int i = 0; i < origin.length; i++)//Loop running on an origin and checks
	{
		for (int j = 0; j < guess.length; j++) {//  
			if(guess[j]==origin[i] && i==j)// if array guess = array origin,- bull counter +
			{
				bull++;
			}else if(guess[j]==origin[i] && i!=j)//if any array guess = any array origin,- cow counter+ 
			{
			cow++;	
			}
		}	
	}
	cbArr[0]=bull;//bulls nubmers
	cbArr[1]=cow;// cow numbers
	return cbArr;
}	
public static int [] intoArray (int origin) // number to array
{
	int num=origin;
	int sum=0;
	int[] numarr= new int [4];// size, 4
	for (int i=3; i>=0; i--) {
		sum=num%10;
		num/=10;
		numarr[i]=sum;//ÈPut the last number to array
	}
	return numarr;//Function returns the result
}	
public static boolean apperarsOnce(int[] origin)
{
	
	if(origin.length!=4)//Checks if the array size = 4 if it is not, removed from the system and returns false
	{
		return false;
	}
	 
	if(origin[0]==0)
		
	{
		return false;
	}
	
	for (int i = 0; i < origin.length; i++) {
		for(int j=i+1; j<origin.length;j++)
		{
		if (origin[i]==origin[j])
		{
		return false;	
		}	
		}
	}
	return true;
}
	
public static void main(String[] args) {
	int[] bullcowArr;
	int num;
	Scanner scan = new Scanner(System.in);
	int random=(int)(Math.random()*9000)+1000;
	while(apperarsOnce(intoArray(random))==false)
	{
		random=(int)(Math.random()*9000)+1000;
	}

		 System.out.println(random+" ");
	System.out.println("please enter number");
	num=scan.nextInt();
   while(apperarsOnce(intoArray(num))==false)
    {
	
    	System.out.println("number not valid try again");
    	num=scan.nextInt();
    
    }
   bullcowArr=CowsAndBulls(intoArray(random), intoArray(num));
   
   while(bullcowArr[0]!=4)
   {
	   System.out.println("bull is: "+(bullcowArr[0])+ " cow is :"+bullcowArr[1]);
	   System.out.println("enter a number");
	   num=scan.nextInt();
	   
	   while(apperarsOnce(intoArray(num))==false)

	    {
		
	    	System.out.println("number not valid , try again");
	    	num=scan.nextInt();
	    
	    }
	   bullcowArr=CowsAndBulls(intoArray(random), intoArray(num));
   }
   if(bullcowArr[0]==4)
   {
	   System.out.println("Congratulations! You won");
   }
}
}