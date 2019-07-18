import java.util.Scanner;

public class queens {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		

		int c = Nqueens(new boolean[4][4], 0, "");
		System.out.println(c);
	}

	public static int Nqueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return 1;
		}
		int count = 0;

		for (int col = 0; col < board[0].length; col++) {
			if (isitpossibletoplace(board, row, col)) {
				board[row][col] = true;
				count += Nqueens(board, row + 1, ans + "(" + row + "-" + col
						+ ")");

				board[row][col] = false;
			}
		}
		return count;
	}

	public static boolean isitpossibletoplace(boolean[][] board, int row,
			int col) {
		//downward
		
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		
		//diagonal
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		return true;
	}
}
