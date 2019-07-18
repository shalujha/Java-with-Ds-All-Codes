import java.util.Scanner;

public class pairofroses {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int T = sj.nextInt();
		for (int i = 0; i < T; i++) {
			int N = sj.nextInt();
			int[] arr = new int[N];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sj.nextInt();
			}
			for (int j = 0; i < arr.length - 1; i++) {
				for (int l = 0; l < arr.length - i - 1; l++) {
					int temp = arr[j];
					arr[j] = arr[l];
					arr[l] = temp;
				}
			}
			int M = sj.nextInt();
			for (int j = 0; j < arr.length; j++) {
				int min = Integer.MAX_VALUE;
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] + arr[k] == M) {

						System.out
								.println("Deepak should buy roses whose prices are"
										+ arr[j] + "and" + arr[k]);

					}

				}

			}
			System.out.println();
		}

	}

}
