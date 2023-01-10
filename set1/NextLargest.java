package set1;

public class NextLargest {
	int[] arr = { 2, 3, 7, 1, 8, 5, 11 };

	public static void main(String[] args) {
		new NextLargest().printNext();
	}

	void printNext() {
		for (int i = 0; i < arr.length; i++) {
			int nextLargest = Integer.MAX_VALUE;   
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					nextLargest = arr[j] > nextLargest ? nextLargest : arr[j];
				}
			}
			System.out.println(arr[i] + "->" + nextLargest);
		}
	}
}
