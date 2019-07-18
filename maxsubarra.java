import java.util.Scanner;

public class maxsubarra {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);

		int t = sj.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sj.nextInt();
			int max = Integer.MIN_VALUE;
			int sum = 0;
			
			long[] arr = new long[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sj.nextLong();
			}

			for (int i = 0; i < arr.length; i++) {

				for (int j = i; j < arr.length; j++) {
					sum += arr[j];
				}

				
			}
			System.out.println(max);
		}
	}
}
