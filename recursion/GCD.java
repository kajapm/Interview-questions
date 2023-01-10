package recursion;

public class GCD {
	public static void main(String[] args) {
		System.out.println(new GCD().gcd(122, 14));
	}

	int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}
}
