import java.util.Scanner;

public class subsequences {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		print(S, " ");

	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);

		print(roq, ans);
		print(roq, ans + ch);
		print(roq, ans + (int) ch);

	}

}
