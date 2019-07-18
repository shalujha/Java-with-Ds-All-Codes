import java.util.Scanner;

public class nqueens {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int c = queens(new boolean[N][N], 0, "");
		System.out.println(c);
		nightqueens(new boolean[N][N], 0, "");
	}

	public static int queens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			// System.out.println("Returning");
			return 1;
		}
		int count = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (isitpossible(board, row, col)) {
				board[row][col] = true;
				count += queens(board, row + 1, ans + "{" + (row + 1) + "-"
						+ (col + 1) + "}");
				board[row][col] = false;
			}
		}

		return count;
	}

	public static boolean isitpossible(boolean[][] board, int row, int col) {
		// upper row and same column
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		// from bottom right to upper left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// from top left to bottom right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[row].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}

	public static void nightqueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.print(ans + " ");
			return;
		}

		for (int col = 0; col < board[row].length; col++) {
			if (isitpossible(board, row, col)) {
				board[row][col] = true;
				nightqueens(board, row + 1, ans + "{" + (row + 1) + "-" + (col + 1) + "} ");
				board[row][col] = false;

			}

		}

	}

}
