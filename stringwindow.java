import java.util.Scanner;

public class stringwindow {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String s1 = sj.next();
		String s2 = sj.next();
		int flag = 0;
		String ans = "";
		int i = 0;
		for (int j = i + 1; j <= s2.length(); j++) {
			char ch = s2.charAt(j);
			for (i = 0; i < s1.length(); i++) {
				if (ch != s1.charAt(i)) {
					flag = 1;
				} else {
					ans = (s1.substring(i, j) + s1.substring(j, j + 1));

				}

			}

		}

		if (flag == 1) {
			System.out.println("No string");

		} else {
			System.out.println(ans);

		}

	}

}
