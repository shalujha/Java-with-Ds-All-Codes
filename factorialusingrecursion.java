import java.util.Scanner;

public class factorialusingrecursion {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int c = factorial(n);
		System.out.println(c);

	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}

		int fnm1 = factorial(n - 1);
		int fn = n * fnm1;

		return fn;

	}

}
