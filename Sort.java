import java.util.Arrays;

public class Sort {
	public static void main (String args[]){
		int[] a ={1,3,65,2,4,2,6,4,5,33,-13};
		sort(a);}
        public static void sort(int[] values) {
                int[] numbers = values;
               int number = values.length;
                int[] helper = new int[number];
                System.out.println(Arrays.toString(numbers));
                mergesort(0, number - 1,numbers,helper);
                System.out.println(Arrays.toString(numbers)); }
        private static int[] mergesort(int low, int high,int[]n, int[]h) {
                // check if low is smaller then high, if not then the array is sorted
                if (low < high) {
                        // Get the index of the element which is in the middle
                        int middle = low + (high - low) / 2;
                        // Sort the left side of the array
                        mergesort(low, middle,n,h);
                        // Sort the right side of the array
                        mergesort(middle + 1, high,n,h);
                        // Combine them both
                        return merge(low, middle, high,n,h); }
				return h; }
        private static int[] merge(int low, int middle, int high,int[]n,int[]h) {
                // Copy both parts into the helper array
                for (int i = low; i <= high; i++) {
                        h[i] = n[i];    }
                int i = low;
                int j = middle + 1;
                int k = low;
                // Copy the smallest values from either the left or the right side back
                // to the original array
                while (i <= middle && j <= high) {
                        if (h[i] <= h[j]) {
                                n[k] = h[i];
                                i++;
                        } else {
                                n[k] = h[j];
                                j++;
                        }
                        k++;
                }
                // Copy the rest of the left side of the array into the target array
                while (i <= middle) {
                        n[k] = h[i];
                        k++;
                       i++;
               }        
return n;
        }
        
}