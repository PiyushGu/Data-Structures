package Miscellaneous;

public class Sudoku {
	public void solveSudoku(char[][] board) {
		if (board == null)
			return;
		solve(board);
	}

	public boolean solve(char[][] board) {

		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.') {
					for (char c = '1'; c <= '9'; c++) {
						if (valid(board, i, j, c)) {
							board[i][j] = c;
							if (solve(board))
								return true;
							else
								board[i][j] = '.';
						}
					}

					return false;
				}

			}

		return true;
	}

	public boolean valid(char[][] board, int row, int col, char c) {
		// check for row
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == c)
				return false;
		}

		for (int j = 0; j < 9; j++) {
			if (board[j][col] == c)
				return false;
		}

		for (int i = (row / 3) * 3; i < (row / 3) * 3 + 3; i++)
			for (int j = (col / 3) * 3; j < (col / 3) * 3 + 3; j++)
				if (board[i][j] == c)
					return false;

		return true;
	}
}