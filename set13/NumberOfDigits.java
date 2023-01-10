package set13;

public class NumberOfDigits {
	public static void main(String[] args) {
		System.out.println("Number of digits : "+new NumberOfDigits().findNumberOfDigits());
	}

	int n = 101;

	int findNumberOfDigits() {
		int count = 0, ones = 0, temp = n;
		while (temp > 0) {
			count++;
			ones = ones * 10 + 1;
			temp /= 10;
		}
		return count * (n + 1) - ones;
	}
}
