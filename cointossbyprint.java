import java.util.Scanner;

public class cointossbyprint {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int S = sj.nextInt();
		print(S, " ");

	}

	public static void print(int S, String ans) {
		if (S == 0) {
			System.out.println(ans);
			return;
		}
		print(S - 1, ans + "H");
		print(S - 1, ans + "T");
	}
}
