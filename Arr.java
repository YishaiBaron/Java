import java.util.Arrays;

public class Arr {
	public static int [] shiftLeft (int [] nums, int [] ttt)
	{
		int[] temp = new int [nums.length+ttt.length];
		temp[0]=nums[0];
		for (int i = nums.length-1; i> 0 ; i--)
		{
			for (int j = ttt.length-1; j> 0 ; j--){
				
				temp[j+nums.length]=ttt[j];
			}
				temp[i]=nums[i];
			}
		temp[nums.length]=ttt[0];
		int c=0;
for ( int i =temp.length; i>0; i--){
	for (int m = nums.length-1; m> 0 ; m--){
		for (int n = ttt.length-1; n> 0 ; n--){	
			if (nums[m]==ttt[n])
				c++;
		}
	
	}
	
}

		return c;
		
	}
	
	
	
	
	
	/*public static void orderNumbers(int[] arr){
		int count1 = 0;
		
	int[] newarr = new int[arr.length];
	for (int i=1; i<arr.length-1; i++)
	//	System.out.print(arr[i] + ", ");
		newarr[i] = arr[i-1];

	

	newarr[newarr.length-1]=arr[0];
		newarr[0]=arr[1];
		
	
										//arr[0]=newarr[arr.length-1];
	
	for(int j = 0 ; j<newarr.length ; j++)
	System.out.print(newarr[j] + ", ");	//1, 1, 2, 2, 2, 3, 3, 

	
	
	}*/
		public static void main(String[] args) {

			int [] arr = {1,3,5,7};
			int [] arr2 = {2,4,6,8};
			System.out.println(Arrays.toString(shiftLeft(arr, arr2)));
					//int arr3[] = {1, 2, 3, 4, 5, 6}; 
				//	shiftLeft(arr3);			

		}
	}

