package recursion;

public class HighestNumber {
	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 ,16};
		System.out.println(new HighestNumber().printHighest(arr, arr.length - 1, 0, ""));
	}

	String printHighest(int[] arr, int index, int max, String output) {
		if (index == -1)
			return output;
		if (arr[index] > max) {
			max = arr[index];
			output = max + " " + output;
		}
		return printHighest(arr, index - 1, max, output);
	}
}
