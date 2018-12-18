public class H4 {
 
	public static void main(String[] args) {
		int a = 123321;
		int b = 12321;
		int c = 1234521;
		System.out.println("a : " + isPalindromeNumber(a));
		System.out.println("b : " + isPalindromeNumber(b));
		System.out.println("c : " + isPalindromeNumber(c));
	}
 
	public static boolean isPalindromeNumber(int x) {
		int y = x;
		int count = 1;
		while (y / 10 > 0) {
			count++;
			y = y / 10;
		}
 
		return isPalindrome(x, count, 1, count);
	}
 
	public static boolean isPalindrome(int x, int count, int start, int end) {
		if (start >= end) {
			return true;
		} else {
			int startNum = (int) ((x / Math.pow(10, (count - start))) % 10);
			int endNum = (int) ((x / Math.pow(10, (count - end))) % 10);
 
			if (startNum == endNum) {
				return isPalindrome(x, count, start + 1, end - 1);
			} else {
				return false;
			}
		}
	}
}