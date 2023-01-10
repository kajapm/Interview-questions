package set5;

public class RotateArray {
	public static void main(String[] args) {
		new RotateArray().print();
	}

	int[][] arr = { { 1, 2, 3, 4 }, { 4, 5, 6, 2 }, { 7, 8, 9, 1 } };

	void print() {
		int row = 0, column = 0, nextElement = arr[row][column],
				limit = arr.length > arr[0].length ? arr[0].length / 2 : arr.length / 2;
		for (int i = 0; i < limit; i++) {
			nextElement = arr[i][column];
			for (int j = i; j < arr.length - (i + 1); j++) {
				arr[j][column] = arr[j + 1][column];
				row = j + 1;
			}
			for (int j = i; j < arr[0].length - (i + 1); j++) {
				arr[row][j] = arr[row][j + 1];
				column = j + 1;
			}
			for (int j = row; j > i; j--) {
				arr[j][column] = arr[j - 1][column];
				row = j - 1;
			}
			for (int j = column; j > i + 1; j--) {
				arr[row][j] = arr[row][j - 1];
				column = j - 1;
			}
			arr[row][column] = nextElement;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
