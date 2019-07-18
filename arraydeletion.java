import java.util.Scanner;

public class arraydeletion {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		int k = sj.nextInt();
		for (int i = k; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];
		}
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]);
		}

	}

}
