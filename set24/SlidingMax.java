package set24;

public class SlidingMax {
	public static void main(String[] args) {
		new SlidingMax().printMaxWithinN();
	}

	int[] arr = { 1,2,3,4,5,6,7,8,9};
	int n = 3;

	void printMaxWithinN() {
		int limit = n, max = 0, startIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (limit > 0) {
				if (arr[i] > max)
					max = arr[i];
				limit--;
			}
			if (limit == 0) {
				System.out.print(max + " ");
				i = startIndex++;
				limit = n;
				max = 0;
			}
		}
	}
}
