import java.util.Scanner;

public class canureadthis {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		int si = 0;
		for (int i = 1; i < S.length()-1; i++) {
			char ch = S.charAt(i);
			if ((int) ch >= 65 && (int) ch <= 90) {
				System.out.println(S.substring(si, i));

			} else {
				System.out.print(S.substring(i + 1, i + 2));
			}
			si++;
		}

	}

}
