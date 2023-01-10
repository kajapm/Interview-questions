package set40;

import java.util.Arrays;

public class QueensMove {
	public static void main(String[] args) {
		System.out.println(new QueensMove().findMove());
	}

	int n = 8, queenX = 3, queenY = 3;

	int findMove() {
		int[][] board = new int[n][n];
		int moves = 0;
		for (int[] row : board) {
			Arrays.fill(row, 0);
		}
		moves = searchRight(queenX, queenY, board, moves);
		moves = searchLeft(queenX, queenY, board, moves);
		moves = searchUp(queenX, queenY, board, moves);
		moves = searchDown(queenX, queenY, board, moves);
		moves = searchUpRight(queenX, queenY, board, moves);
		moves = searchDownRight(queenX, queenY, board, moves);
		moves = searchUpLeft(queenX, queenY, board, moves);
		moves = searchDownLeft(queenX, queenY, board, moves);

		return moves;
	}

	int searchRight(int queenX, int queenY, int[][] board, int moves) {
		if (board[0].length <= queenY || board[queenX][queenY] != 0)
			return moves - 1;
		return searchRight(queenX, queenY + 1, board, moves + 1);
	}

	int searchLeft(int queenX, int queenY, int[][] board, int moves) {
		if (0 > queenY || board[queenX][queenY] != 0)
			return moves - 1;
		return searchLeft(queenX, queenY - 1, board, moves + 1);
	}

	int searchUp(int queenX, int queenY, int[][] board, int moves) {
		if (0 > queenX || board[queenX][queenY] != 0)
			return moves - 1;
		return searchUp(queenX - 1, queenY, board, moves + 1);
	}

	int searchDown(int queenX, int queenY, int[][] board, int moves) {
		if (board.length <= queenX || board[queenX][queenY] != 0)
			return moves - 1;
		return searchDown(queenX + 1, queenY, board, moves + 1);
	}

	int searchUpRight(int queenX, int queenY, int[][] board, int moves) {
		if (0 > queenX || board[0].length <= queenY || board[queenX][queenY] != 0)
			return moves - 1;
		return searchUpRight(queenX - 1, queenY + 1, board, moves + 1);
	}

	int searchDownRight(int queenX, int queenY, int[][] board, int moves) {
		if (board.length <= queenX || board[0].length <= queenY || board[queenX][queenY] != 0)
			return moves - 1;
		return searchDownRight(queenX + 1, queenY + 1, board, moves + 1);
	}

	int searchUpLeft(int queenX, int queenY, int[][] board, int moves) {
		if (0 > queenY || 0 > queenX || board[queenX][queenY] != 0)
			return moves - 1;
		return searchUpLeft(queenX - 1, queenY - 1, board, moves + 1);
	}

	int searchDownLeft(int queenX, int queenY, int[][] board, int moves) {
		if (board.length <= queenX || 0 > queenY || board[queenX][queenY] != 0)
			return moves - 1;
		return searchDownLeft(queenX + 1, queenY - 1, board, moves + 1);
	}

}
