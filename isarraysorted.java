import java.util.Scanner;

public class isarraysorted {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int i = 0;
		boolean c = isarray(arr, i);
		System.out.println(c);

	}

	public static boolean isarray(int[] arr, int i) {

		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;

		} else {
			boolean d = isarray(arr, i + 1);

			return d;
		}

	}

}
