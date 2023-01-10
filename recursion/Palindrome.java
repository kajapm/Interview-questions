package recursion;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(new Palindrome().isPalindrome("malayalam", 0));
	}

	boolean isPalindrome(String str, int start) {
		if (start >= str.length() - 1 - start)
			return true;
		if (str.charAt(start) != str.charAt(str.length() - 1 - start))
			return false;
		return isPalindrome(str, start + 1);
	}
}
