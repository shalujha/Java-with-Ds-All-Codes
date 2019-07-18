import java.util.Scanner;

public class javaloops2 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int q = sj.nextInt();
		for (int k = 0; k < q; k++) {
			int sum = 0;

			int a = sj.nextInt();
			int b = sj.nextInt();
			int n = sj.nextInt();
			for (int i = 0; i <= n - 1; i++) {

				int d = (int) Math.pow(2, i);
				if (i == 0) {
					sum += (a + d * b);
				} else {
					sum += (d * b);
				}
				System.out.print(sum + " ");
			}
			System.out.println();

		}

	}
}