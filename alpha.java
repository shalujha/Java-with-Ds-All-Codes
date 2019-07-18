import java.util.Scanner;

public class alpha {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextLong();

		}
		long sum = 0, result = 0;
		for (int k = 0; k < n; k++) {
			for (int j = k + 1; j < n; j++) {
				if (arr[j] < arr[k]) {
					sum += arr[j];
				}

			}

		}
		result = result + sum;
		result = result % (((int) Math.pow(10, 9)) + 7);
		System.out.println(result);

	}

}
