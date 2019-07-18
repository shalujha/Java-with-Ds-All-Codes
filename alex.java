import java.util.Scanner;

public class alex {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sj.nextInt();
		}
		int q = sj.nextInt();
		for (int i = 1; i <= q; i++) {
			int amount = sj.nextInt();
			int k = sj.nextInt();
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if (amount % A[j] == 0) {
					count++;
				}
			}

			if (count >= k) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}
