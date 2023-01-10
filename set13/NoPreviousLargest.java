package set13;

public class NoPreviousLargest {
	public static void main(String[] args) {
		new NoPreviousLargest().print();
	}

	int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	void print() {
		int n = 0X80000000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > n) {
				System.out.print(arr[i] + " ");
				n = arr[i];
			}
		}
	}
}
