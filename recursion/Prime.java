package recursion;

public class Prime {
	public static void main(String[] args) {
		int num = 9999973;
		System.out.println(new Prime().isPrime(num, num, 2));
	}

	boolean isPrime(int num, int limit, int start) {
		if (start > limit)
			return true;
		if (num % start == 0)
			return false;
		return isPrime(num, num / start, start + 1);
	}
}
