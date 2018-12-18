import java.util.Arrays;

public class n5 {
	public static boolean firstBiggerThan(int[] a, int[] b){
return ogg(a,b ,0,0);

	}
	
	private static boolean ogg(int[] a, int[] b, int i, int j) {
	if (i==a.length) 
			return true;
		if (j==b.length)
			return ogg(a, b, i+1, j=0);
		if (i<a.length)   {
			if (a[i] > b[j])
			return ogg(a, b, i, j+1);
			else 
				return false;
		}
		return true;

	}
	public static int minIndex(int[] a){
		return findmin(a,0,0);
	}
	private static int findmin(int[] a, int i,int c) {
	int min = a[i];
	for (int j=0; j<a.length; j++)
		if (min>a[j]) i++;c++;
		return c;
	}
	public void sort(int[] values) {
      int[] numbers = values;
        int number = values.length;
        int[] helper = new int[number];
      swap(0, number - 1);
}
	private void swap(int low, int high) {
	     if (low < high) {
	    	 int middle = low + (high - low) / 2;
             // Sort the left side of the array
             swap(low, middle);
             // Sort the right side of the array
             swap(middle + 1, high);
             // Combine them both
             merge(low, middle, high);
	     }
	     
	}

    private void merge(int low, int middle, int high) {

            // Copy both parts into the helper array
            for (int i = low; i <= high; i++) {
                    helper[i] = numbers[i];
            }

            int i = low;
            int j = middle + 1;
            int k = low;
            // Copy the smallest values from either the left or the right side back
            // to the original array
            while (i <= middle && j <= high) {
                    if (helper[i] <= helper[j]) {
                            numbers[k] = helper[i];
                            i++;
                    } else {
                            numbers[k] = helper[j];
                            j++;
                    }
                    k++;
            }
            // Copy the rest of the left side of the array into the target array
            while (i <= middle) {
                    numbers[k] = helper[i];
                    k++;
                    i++;
            }

    }

	public static void diceRoll(int dices)

	{
		int t = (int) Math.pow(6, dices);
		dic(new int[dices], 0,t);
		}

private static void dic(int[] roll, int i,int t) {
	if(i==roll.length)
	{
		int s=0;
		for (int j=0; j< roll.length; j++){
			s += roll[j];
		}
			
	System.out.print(Arrays.toString(roll)+(s));
	return;
}
	for (int dice=1; dice<=6; dice++)
{
		int[] copy=roll;
		copy[i]=dice;
		dic(copy, i+1,t);
	}
	System.out.println();
	}
public static void main(String[]args)
{
	//diceRoll(2);

int[] a= {4,1,8,5};
int[] b= {1,2,3};
sort(a);
//System.out.println(maxOccurrences(a,2));

System.out.println(minIndex(a));
}
}///S
//  2 1/36 = 2.7%	
// 12 1/36 = 2.7%	
//  3 2/36 = 5.5%
// 11 2/36 = 5.5%
//  4 3/36 = 8.3%
// 10 3/36 = 8.3%
// 5  4/36 = 11.1%
// 9  4/36 = 11.1%
// 6  5/36 = 13.5% 
// 8  5/36 = 13.5%
// 7  6/36 = 16.6%
