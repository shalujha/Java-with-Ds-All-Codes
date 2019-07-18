import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int c = factorialusingrecursion(n);
		System.out.println(c);

	}

	public static int factorialusingrecursion(int n) {
		if (n == 0) {
			return 1;
		}
		int d = factorialusingrecursion(n - 1);
		int ans = n * d;

		return ans;
	}

}
