import java.util.Scanner;

public class basiccalculator {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		char ch = sj.next().charAt(0);

		if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
			int N1 = sj.nextInt();
			int N2 = sj.nextInt();

			if (ch == '+') {
				System.out.println(N1 + N2);
			}
			if (ch == '-') {
				System.out.println(N1 - N2);
			}
			if (ch == '*') {
				System.out.println(N1 * N2);
			}
			if (ch == '/') {
				System.out.println(N1 / N2);
			}
			if (ch == '%') {
				System.out.println(N1 % N2);
			}
		}

		if (ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '%'
				&& ch != 'X' && ch != 'x') {
			System.out.println("Invalid operation. Try again.");

		}

	}

}

