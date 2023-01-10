package set27;

public class PrimeFactors {
	int[] input = { 12, 5, 16, 8 };

	public static void main(String[] args) {
		new PrimeFactors().init();
	}

	void init() {
		// PrimeCount[] output = new PrimeCount[input.length];
		for (int i = 0; i < input.length; i++) {
			findPrimeFactor(input[i]);
		}
	}

	void findPrimeFactor(int element) {
		int factor = 2;
		while (element > 1) {
			if (element % factor == 0) {
				System.out.print(factor + " ");
				element /= factor;
			} else
				factor = nextPrime(factor);
		}
		System.out.println();
	}

	int nextPrime(int prime) {
		for (int i = prime + 1;; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && j != i) {
					break;
				}
				if (j > i / 2)
					return i;
			}
		}
	}
}

class PrimeCount {
	int element;
	int[] factors;
}
