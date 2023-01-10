package set1;

import java.util.Arrays;

public class SudokuSolver {
	public static void main(String[] args) {
		new SudokuSolver().play();
	}

	int[][] board = { { 7, 0, 2, 0, 5, 0, 6, 0, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0 }, { 1, 0, 0, 0, 0, 9, 5, 0, 0 },
			{ 8, 0, 0, 0, 0, 0, 0, 9, 0 }, { 0, 4, 3, 0, 0, 0, 7, 5, 0 }, { 0, 9, 0, 0, 0, 0, 0, 0, 8 },
			{ 0, 0, 9, 7, 0, 0, 0, 0, 5 }, { 0, 0, 0, 2, 0, 0, 0, 0, 0 }, { 0, 0, 7, 0, 4, 0, 2, 0, 3 } };

	boolean isNumberInRow(int column, int number) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][column] == number) {
					return true;
				}
			}
		}
		return false;
	}

	boolean isNumberInColumn(int row, int number) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[row][j] == number) {
					return true;
				}
			}
		}
		return false;
	}

	boolean isNumberInBox(int row, int column, int number) {
		row = row - (row % 3);
		column = column - (column % 3);
		for (int i = row; i < row + 3; i++) {
			for (int j = column; j < column + 3; j++) {
				if (board[i][j] == number) {
					return true;
				}
			}
		}
		return false;
	}

	boolean isValidPlacement(int row, int column, int number) {
		return !isNumberInRow(column, number) && !isNumberInColumn(row, number) && !isNumberInBox(row, column, number);
	}

	boolean play() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0) {
					for (int k = 1; k <= board.length; k++) {
						if (isValidPlacement(i, j, k)) {
							board[i][j] = k;
							if(play())
								return true;
							else board[i][j] = 0;
						}
					}
					return false;
				}
			}
		}
		System.out.println(Arrays.deepToString(board));
		return true;
	}

}
