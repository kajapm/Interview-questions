package recursion;

public class Sum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(new Sum().sumOfElements(arr, arr.length - 1));
	}

	int sumOfElements(int[] arr, int index) {
		if (index == 0) {
			return arr[0];
		}
		return arr[index] + sumOfElements(arr, index - 1);
	}
}
