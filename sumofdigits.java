import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		int N = sum(S);
		System.out.println(N);
	}

	public static int sum(String S) {

		if (S.length() == 0) {
			return 0;
		}

		char ch = S.charAt(0);
		String ros = S.substring(1);
		int d = sum(ros);
		int ans = d + ch - '0';
		return ans;
	}

}
