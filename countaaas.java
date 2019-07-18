import java.util.Scanner;

public class countaaas {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		countaaa(str, 0, 0);
		countaaawithoutoverlapp(str, 0, 0);

	}

	public static void countaaa(String str, int i, int count) {

		if (i == str.length() - 2) {
			System.out.println(count);
			return;
		}

		if (str.substring(i, i+3).equals("aaa")) {
			countaaa(str, i + 1, count + 1);
		} else {
			countaaa(str, i + 1, count);
		}
	}

	public static void countaaawithoutoverlapp(String str, int i, int count) {
		if (i > str.length()-3) {
			System.out.println(count);
			return;
		}

		if (str.substring(i, i+3).equals("aaa")) {
			countaaawithoutoverlapp(str, i + 3, count + 1);
		} else {
			countaaawithoutoverlapp(str, i + 1, count);
		}
	}
}
