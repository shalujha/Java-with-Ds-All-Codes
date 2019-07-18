import java.util.Scanner;

public class sortinginlineartime {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sj.nextInt();

		}
		int lo = 0;
		int hi = N - 1;
		int mid = 0;

		while (mid <= hi) {
			switch (arr[mid]) {
			case 0: {
				int temp = arr[lo];
				arr[lo] = arr[mid];
				arr[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				int temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
				break;
			}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

}
