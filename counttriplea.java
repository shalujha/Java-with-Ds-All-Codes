import java.util.Scanner;

public class counttriplea {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		int i = 0;
		int count = 0;
		fun1(str, i, count);
		fun2(str, i, count);
	}

	public static void fun1(String str, int i, int count) {
		if (i == str.length() - 2) {
			System.out.println(count);

			return;
		}

		if (str.substring(i, i + 3).equals("aaa")) {
			fun1(str, i + 1, count + 1);
		} else {
			fun1(str, i + 1, count);
		}

	}

	public static void fun2(String str, int i, int count) {
		if (i == str.length() - 2) {
			System.out.println(count);

			return;
		}

		if (str.substring(i, i + 3).equals("aaa")) {
			fun2(str, i + 1, count + 1);

		} else {
			fun2(str, i + 1, count);
		}

	}
}