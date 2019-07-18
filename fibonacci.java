import java.util.Scanner;

public class fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, i, n;
		Scanner gg = new Scanner(System.in);
		System.out.println("enter any no whose series u want to enter");
		n = gg.nextInt();

		a = 0;
		b = 1;
		System.out.println(a);
		System.out.println(b);
		for (i = 0; i <= n - 1; i++) {

			c = a + b;
			b =a;
			b=c;
			System.out.println(c);
		}

	}

}
