import java.util.Scanner;

public class edit_distance {

	public static void main(String[] args) {

		new Scanner(System.in);
		System.out.println(edit("agbg", "acgb"));
		System.out.println(editdp("agbg", "acgb"));

	}

	public static int edit(String str1, String str2) {
		if (str1.length() == 0) {
			return str2.length();
		}

		if (str2.length() == 0) {
			return str1.length();
		}

		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);
		int count = 0;
		if (str1.charAt(0) == str2.charAt(0)) {
			count = edit(ros1, ros2);
		} else {
			int f1 = 1 + edit(ros1, ros2);
			int f2 = 1 + edit(ros1, str2);
			int f3 = 1 + edit(str1, ros2);
			count = Math.min(f1, Math.min(f2, f3));
		}
		return count;
	}

	public static int editdp(String str1, String str2) {

		int[][] strg = new int[str1.length() + 1][str2.length() + 1];
		strg[str1.length() ][str2.length() ] = 0;
		for (int i = str2.length(); i >= 0; i--) {
			for (int j = str1.length(); j >= 0; j--) {
				if (i == str2.length()) {
					strg[i][j] = str2.length() - j;
					continue;
				}
				if (j == str1.length()) {
					strg[i][j] = str1.length() - i;
					continue;
				}
				if (str2.charAt(i) == str1.charAt(j)) {
					strg[i][j] = strg[i + 1][j + 1];
				} else {
					strg[i][j] = 1 + Math.min(strg[i + 1][j],
							Math.min(strg[i][j + 1], strg[i + 1][j + 1]));
				}

			}
		}
		return strg[0][0];
	}

}
