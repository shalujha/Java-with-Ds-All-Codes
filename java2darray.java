import java.util.Scanner;

public class java2darray {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int[][] arr = new int[6][6];
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sj.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j - 1] + arr[i][j + 1] + arr[i + 1][j]
						+ arr[i + 2][j] + arr[i + 2][j - 1] + arr[i + 2][j + 1];
			}
			if (sum > maxsum) {
				maxsum = sum;
			}

		}

		System.out.println(maxsum);

	}

}
