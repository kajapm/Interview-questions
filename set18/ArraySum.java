package set18;

public class ArraySum {
	public static void main(String[] args) {
		new ArraySum().addArrayElements();
	}

	int[] arr1 = { 9, 9, 9, 9, 9, 9 };
	int[] arr2 = { 1 };

	void addArrayElements() {
		int remainder = 0, arr1Index = arr1.length - 1, arr2Index = arr2.length - 1;
		String output = "";
		while (arr1Index >= 0 || arr2Index >= 0 || remainder > 0) {
			int arr1Element = 0, arr2Element = 0, sum = 0;

			if (arr1Index >= 0) {
				arr1Element = arr1[arr1Index];
			}
			if (arr2Index >= 0) {
				arr2Element = arr2[arr2Index];
			}
			sum = arr1Element + arr2Element + remainder;
			remainder = 0;
			if (sum > 9) {
				output = sum % 10 + output;
				remainder = sum / 10;
			} else {
				output = sum + output;
			}
			arr1Index--;
			arr2Index--;
		}
		System.out.println(output);
	}
}
