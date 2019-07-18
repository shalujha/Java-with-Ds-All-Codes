import java.util.Scanner;

public class substringifpallindrome {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		// boolean c= pallindrome(str);

		substring(str);
	}

	public static boolean pallindrome(String str) {
		String gg = str;
		int n = gg.length();
		for (int i = 0; i < gg.length(); i++) {
			if (gg.charAt(i) != gg.charAt(gg.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void substring(String str) {
		String gg = str;
		for (int i = 0; i < gg.length(); i++) {
			for (int j = i + 1; j <= gg.length(); j++) {
				String ss = gg.substring(i, j);
				if (pallindrome(ss))
					System.out.println(ss);

			}
		}

	}
}