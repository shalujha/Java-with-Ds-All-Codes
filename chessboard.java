import java.util.Scanner;

public class chessboard {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int c = chess(0, 0, N, N,"");
		System.out.println(c);
		chessboard(0, 0, N, N, "");

	}

	public static void chessboard(int cr, int cc, int er, int ec, String ans) {
		if (cr == er - 1 && cc == ec - 1) {
			System.out.print(ans + "{" + cr + "-" + cc + "}");
			return;
		}

		if (cr >= er || cc >= ec) {
			return;
		}

		chessboard(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		chessboard(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {
			
			for (int moves = 1; moves <= ec
					- 1; moves++) {

				chessboard(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc
						+ "}R");

			}
			for (int moves = 1; moves <= er - 1; moves++) {
				chessboard(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc
						+ "}R");
			}

		}

		if (cr == cc || cr + cc == er - 1) {
			for (int moves = 1; moves <= er - 1; moves++) {
				chessboard(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-"
						+ cc + "}B");

			}

		}

	}

	public static int chess(int cr, int cc, int er, int ec, String ans) {
		if (cr == er - 1 && cc == ec - 1) {
		//	System.out.println(ans + "{" + cr + "-" + cc + "}");
			return 1;
		}

		if (cr >= er || cc >= ec) {
			return 0;
		}
		int count = 0;

		count += chess(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		count += chess(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

		if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {
			for (int moves = 1; moves <= er - 1; moves++) {
				count += chess(cr + moves, cc, er, ec, ans + "{" + cr + "-"
						+ cc + "}R");
			}
			for (int moves = 1; moves <= ec - 1; moves++) {

				count += chess(cr, cc + moves, er, ec, ans + "{" + cr + "-"
						+ cc + "}R");

			}

		}

		if (cr == cc || cr + cc == er - 1) {
			for (int moves = 1; moves <= er - 1; moves++) {
				count += chess(cr + moves, cc + moves, er, ec, ans + "{" + cr
						+ "-" + cc + "}B");

			}

		}
		return count;
	}

}
