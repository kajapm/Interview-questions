package set39;

public class ArrayAddition {
	public static void main(String[] args) {
		new ArrayAddition().sumOfArray();
	}

	int[][] arr = { { 2, 4, 5 }, { 4, 5, 6, 7, 8 }, { 4, 9, 2, 1 }, { 1, 2 } };

	void sumOfArray() {
		String output = "";
		int maxIndex = 0, remainder = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length > maxIndex)
				maxIndex = arr[i].length;
		}
		for (int i = 1; i < maxIndex || remainder != 0; i++) {
			int sum = getSum(i);
			sum += remainder;
			remainder = 0;
			if (sum > 9)
				remainder = sum / 10;
			output = (sum % 10) + output;
		}
		System.out.println(output);
	}

	int getSum(int column) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length - column >= 0) {
				sum += arr[i][arr[i].length - column];
			}
		}
		return sum;
	}

}
