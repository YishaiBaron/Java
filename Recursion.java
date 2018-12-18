public class Recursion{ 
public static void main(String[] args){
    int arr[] = {1,2,3,4,5,6};

    System.out.println(sum(arr, arr.length-1));
    System.out.println(count("abcac", 'c', 0));

}

public static int sum(int[] array, int index) {
    if (index == 0) {
        return array[0];
    } else {
        return array[index] + sum(array, index - 1);
    }

   
}
public static int count(String s, char c , int d) {
	if (s.length()>0) {
		if (s.charAt(0)==c) {
			 d++;
		}
		 return count(s.substring(1), c , d);   
	}
	return d;
	
}
public static boolean hh(int[] a) {
	return true;
}



}