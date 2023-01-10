package set5;

public class LargestPrime {
	static int n = 4691;
	static int maxValue = n;

	public static void main(String[] args) {
		LargestPrime lg = new LargestPrime();
		System.out.println(lg.getLargestPrime(String.valueOf(n), 0, 4));
	}

	int getLargestPrime(String s, int left, int right) {
		if (left == right) {
			int temp = Integer.parseInt(s);
			if (maxValue < temp && isPrime(temp))
				maxValue = temp;
		} else {
			for (int i = left; i < right; i++) {
				s = swap(s, i, left);
				getLargestPrime(s, left + 1, right);
				s = swap(s, i, left);
			}
		}
		return maxValue;
	}

	String swap(String s, int firstIndex, int secondIndex) {
		char[] c = s.toCharArray();
		char temp = c[firstIndex];
		c[firstIndex] = c[secondIndex];
		c[secondIndex] = temp;
		return String.valueOf(c);
	}

	boolean isPrime(int n) {

		if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		else {
			for (int i = 3; i < n / 2; i += 2) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}
}
