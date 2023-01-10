package recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(new Factorial().fact(4));
	}

	int fact(int n) {
		if (n == 1)
			return n;
		return n * fact(n - 1);
	}
}
