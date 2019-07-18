import java.util.Scanner;

public class nextsmaller {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sj.nextInt();
			int[] arr = new int[n];
			int flag2 = 0;
			int temp = 0;
			int j = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = sj.nextInt();
			}

			for (int i = 0; i < arr.length; i++) {
				temp = -1;
				for (j = i + 1; j < arr.length; j++) {
					if (arr[j] > arr[i])
						temp = arr[j];
					break;
				}
			}
			for (int l = j + 1; l < arr.length; l++) {
				if (temp == -1) {
					System.out.print("-1" + " ");
					break;
				} else {
					if (arr[k] < temp) {
						System.out.print(arr[k] + " ");
						flag2 = 1;
						break;
					}
				}
				if (flag2 == 0) {
					System.out.print("-1" + " ");
				}
				System.out.println();

			}

		}

	}

}
