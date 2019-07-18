import java.util.Scanner;

public class isarraysorted1 {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		System.out.println(sorted(arr, 0));

	}

	public static boolean sorted(int[] arr, int i) {
		boolean c;
		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;
		} else {
			c = sorted(arr, i + 1);
		}
		return c;
	}

}
