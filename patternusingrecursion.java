import java.util.Scanner;

public class patternusingrecursion {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int i = 0;
		pattern(N, i);

	}

	public static void pattern(int N, int i) {
		if (N == 0) {
			return;
		}

		pattern(N - 1, i + 1);
		for (int j = 1; j <= N; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
