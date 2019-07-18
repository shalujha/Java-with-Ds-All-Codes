import java.util.Scanner;

public class recursiontwinss {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		twins(str, 0, 0);

	}

	public static void twins(String str, int i, int count) {
		if (i == str.length() - 2) {
			System.out.println(count);
			return;
		}

		if (str.charAt(i) == str.charAt(i + 2)) {
			twins(str, i + 1, count + 1);
		} else {
			twins(str, i + 1, count);
		}
	}

}
