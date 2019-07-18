import java.util.Scanner;

public class nextgreaterelementinanarray {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();

		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					System.out.println(arr[j]);
					break;
				}

			}
		}
		System.out.println("-1");
	}

}
