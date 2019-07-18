import java.util.Scanner;

public class iscontained {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		int item = sj.nextInt();
		System.out.println(isContained(arr, 0, item));
	}

	public static boolean isContained(int[] arr, int i, int item) {
		boolean c;
		if (i == arr.length) {
			return false;
		}
		if (arr[i] == item) {
			return true;
		} else {
			c = isContained(arr, i + 1, item);
		}
		return true;
	}

}
