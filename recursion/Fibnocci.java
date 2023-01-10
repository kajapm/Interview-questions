package recursion;

public class Fibnocci {
	public static void main(String[] args) {
		System.out.println(new Fibnocci().fib(6));
	}

	int fib(int n) {
		if (n <= 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}
}
