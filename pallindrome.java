import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		boolean a = pallindrome(str);
		if (a == true) {
			System.out.println("pallindrome");
		} else {
			System.out.println("not a pallindrome");
		}

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

}
