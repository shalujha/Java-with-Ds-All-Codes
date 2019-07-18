import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int T = sj.nextInt();
		int sum, i, j, m, max;

		for (m = 1; m <= T; m++) {
			int n = sj.nextInt();
			int k = sj.nextInt();
			int[] arr = new int[n];

			for (i = 0; i < arr.length; i++) {
				arr[i] = sj.nextInt();
			}
			sum = 0;
			for (i = 0; i < arr.length - k + 1; i++) {

				int min = Integer.MAX_VALUE;
				max = Integer.MIN_VALUE;
				for (j = i; j < i + k; j++) {

					if (arr[j] < min) {
						min = arr[j];
					}

					if (max < arr[j]) {
						max = arr[j];
					}

				
				}
				sum+=min+max;
			}
			System.out.println(sum);

		}
	}
}
