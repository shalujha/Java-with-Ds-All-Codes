import java.util.Scanner;

public class patternr2 {
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();

		int temp = n;
		int c = 1;
		while (n != 0) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
			System.out.println();
			n--;
		}

		while (c <= temp) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			System.out.println();
			c++;
		}

	}

}
