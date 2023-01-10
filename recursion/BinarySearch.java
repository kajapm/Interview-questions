package recursion;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println(new BinarySearch().binarySearch(arr, 0, 5, 4));
	}

	int binarySearch(int[] arr, int start, int end, int element) {
		if (end >= start) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == element)
				return mid;
			if (arr[mid] > element)
				return binarySearch(arr, start, mid - 1, element);
			return binarySearch(arr, mid + 1, end, element);
		}
		return -1;
	}
}
