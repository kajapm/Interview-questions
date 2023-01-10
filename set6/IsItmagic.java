package set6;

public class IsItmagic {
	public static void main(String[] args) {
		System.out.println(new IsItmagic().isMagic());
	}

	int n = 1234;

	boolean isMagic() {
		while (n > 9) {
			n = sum(n);
		}
		if (n == 1)
			return true;

		return false;
	}

	int sum(int input) {
		int sum = 0;
		while (input > 0) {
			sum += input % 10;
			input /= 10;
		}
		return sum;
	}
}
