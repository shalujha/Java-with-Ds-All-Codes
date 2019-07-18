import java.util.Scanner;

public class anothermethod {
	public static void main(String args[]) throws Exception {
		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		System.out.println(count(str, true));
		System.out.println(count(str, false));

	}

	public static int count(String str, boolean overlap) {

		int count = 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'a'
					&& str.charAt(i + 2) == 'a') {
				if (!overlap) {
					i += 2;
				}
				count++;
			}
		}

		return count;

	}
}