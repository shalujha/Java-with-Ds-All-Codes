import java.util.Scanner;

public class ispallindrome {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		System.out.println(ispallindrome(str, 0));

	}

	public static boolean ispallindrome(String str, int i) {
		boolean c;
		if (i > str.length() / 2) {
			return true;
		}
		if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
			return false;
		} else {
			c = ispallindrome(str, i + 1);
		}

		return c;

	}

}
