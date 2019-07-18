import java.util.Scanner;

public class maxusingrecursion {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);

		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}

		int vidx = 0;
		int c = max(arr, vidx);
		System.out.println(c);

	}

	public static int max(int[] arr, int vidx) {
		int b = Integer.MIN_VALUE;
		if (vidx == arr.length) {
			return b;
		}
		int rm = max(arr, vidx + 1);
		if (arr[vidx] > rm) {
			return arr[vidx];
		} else {
			return rm;
		}

	}

}