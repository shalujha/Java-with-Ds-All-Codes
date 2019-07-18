import java.util.Scanner;

public class lcs {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str1 = sj.next();
		String str2 = sj.next();
		System.out.println(lcs(str1, str2));
		System.out.println(lcsdp(str1, str2));

	}

	public static int lcs(String str1, String str2) {
		if (str1.length() == 0 || str2.length() == 0) {
			return 0;
		}

		int count = 0;
		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		if (str1.charAt(0) == str2.charAt(0)) {
			count = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(ros1, str2);
			int f2 = lcs(str1, ros2);

			count = Math.max(f1, f2);
		}
		return count;
	}

	public static int lcsdp(String str1, String str2) {
		int[][] strg = new int[str1.length() + 1][str2.length() + 1];
		// seeed
		strg[str1.length()][str2.length()] = 0;
		for (int i = str1.length(); i >= 0; i--) {
			for (int j = str2.length(); j >= 0; j--) {
				if (i==str1.length() || j==str2.length()) {
					strg[i][j] = 0;
					continue;
				}
				if (str1.charAt(i) == str2.charAt(i)) {
					strg[i][j] = 1+strg[i + 1][j + 1];

				} else {
					strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);
				}
			}
		}

		return strg[0][0];
	}

}
