package recursion;

public class NumberReverse {
	public static void main(String[] args) {
		System.out.println(new NumberReverse().reverse(54321, 0));
	}

	int reverse(int n, int out) {
		if (n <= 0)
			return n;
		out = out * 10 + (n % 10);
		return out + reverse(n / 10, out);
	}
}
