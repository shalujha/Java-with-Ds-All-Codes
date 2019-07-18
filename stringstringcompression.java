import java.util.Scanner;

public class stringstringcompression {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		int count = 0;
		char ch = S.charAt(0);
		for (int i = 0; i < S.length(); i++) {
			if (ch == S.charAt(i)) {
				count++;
			} else {
				if (count == 1) {
					System.out.print(ch);
				} else {
					System.out.print(ch + "" + count);
				}

				count = 1;
				ch = S.charAt(i);
			}

		}
		if (count == 1) {
			System.out.print(ch);
		} else {

			System.out.print(ch + "" + count);

		}
	}
}