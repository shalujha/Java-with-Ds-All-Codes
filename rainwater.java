import java.util.Scanner;

public class rainwater {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();
		for (int k = 0; k < t; k++) {
			int N = sj.nextInt();
			long [] A = new long[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sj.nextLong();
			}
			long[] left = new long[N];
			left[0] = A[0];
			for (int j = 1; j < A.length; j++) {
				left[j] = Math.max(left[j - 1], A[j]);
			}

			long[] right = new long[N];
			right[A.length-1] = A[A.length - 1];
			for (int l = A.length - 2; l >= 0; l--) {
				right[l] = Math.max(right[l + 1], A[l]);
			}
			long sum = 0;
			for (int m = 0; m < A.length; m++) {
				sum += (Math.min(left[m], right[m]) - A[m]);
			}
			System.out.println(sum);

		}

	}
}
