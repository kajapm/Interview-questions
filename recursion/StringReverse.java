package recursion;

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(new StringReverse().reverseString("india", 4));
	}

	String reverseString(String s, int length) {
		if (length == 0)
			return s.charAt(length) + "";
		return s.charAt(length) + reverseString(s, length - 1);
	}
}
