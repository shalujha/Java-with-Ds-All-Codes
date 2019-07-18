import java.util.ArrayList;
import java.util.Scanner;

public class printmazepath {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int count = mazepath(0, 0, N-1, N-1, "");
		System.out.println(count);
		maze(1, 1, N, N, "");

	}

	public static void maze(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {

			System.out.print(ans + " ");
			return;
		}

		if (cr > er || cc > ec) {
			return;
		}

		maze(cr + 1, cc, er, ec, ans + 'V');
		maze(cr, cc + 1, er, ec, ans + 'H');
		if (cr == cc || cr + cc == ec) {
			maze(cr + 1, cc + 1, er, ec, ans + 'D');

		}
	}

	public static int mazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {

			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count += mazepath(cr + 1, cc, er, ec, ans + 'V');
		count += mazepath(cr, cc + 1, er, ec, ans + 'H');
		if (cr == cc || cr + cc == ec) {
			count += mazepath(cr + 1, cc + 1, er, ec, ans + 'D');

		}

		return count;
	}

}
