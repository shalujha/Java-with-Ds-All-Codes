import java.util.Scanner;

public class nextsmallerofnextgreate {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int l = 0; l < t; l++) {
			for (int i = 0; i < n; i++) {
				arr[i] = sj.nextInt();

			}
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[j] < arr[i]) {
						int c = arr[j];
						int d = j;

						for (int k = d; k < n; k++) {
							if (arr[k] > c) {
								System.out.println(arr[k]);
							} else {
								System.out.println("-1");
							}
						}
					}

				}
			}
		}
	}

}
