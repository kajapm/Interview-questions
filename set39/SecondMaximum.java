package set39;

public class SecondMaximum {
	public static void main(String[] args) {
		new SecondMaximum().secondMax();
	}

	int[] arr = { -10, -20, -50, 0, -1 };

	void secondMax() {
		int max = 0x80000000, secondMax = 0x80000000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			if (arr[i] < max && arr[i] > secondMax) {
				secondMax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}
}
