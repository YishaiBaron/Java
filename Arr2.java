import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) 
    {
      //  int[] r1 = {1,2,3,45,65,42};
     //	System.out.println(Arrays.toString(r1))
     	;
    	int[][] arr = {{2,7,2},{3,3,5},{4,4,7},{1,3,5}};
    	for(int i =0 ; i<arr.length; i++)  {
         	System.out.print(Arrays.toString(arr[i]));
        	System.out.println();	      }
    		
    //	System.out.println(getAvg(arr));
    	System.out.println(getTotalRow(arr, 2));
    	System.out.println(getkk(arr));
    }
	
public static double getAvg (int[][] arr) {
double sum =0;
int counter=0;
			
	for(int i =0 ; i<arr.length; i++)  {
		for (int j =0; j<arr.length; j++) {
			 sum += arr[j][i];
			 
			counter++;
		}
	}
	return sum/counter;
	
}

	
public static int getTotalRow(int[][] arr,int t) {
	int sum=0;
	for(int k =0 ; k<arr.length; k++)  {
			sum+=arr[k][t];
		}
		
	return sum;
}

public static int getkk(int[][] arr) {
	int sum=0;
 	for(int i =0 ; i<arr.length; i++)  {
 	 	for(int j =0; j<arr.length; j++){
 		if (arr[i]== arr[j])
 	}}
 	return sum;
}
}
