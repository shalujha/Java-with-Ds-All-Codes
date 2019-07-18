import java.util.Scanner;

public class lastindexbyrecursion {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int i = arr.length - 1;
		int item = sj.nextInt();
		int c = lastindices(arr, i, item);
		System.out.println(c);

	}

	public static int lastindices(int[] arr, int i, int item) {
		if (i < 0) {
			return -1;
		}
		if (arr[i] == item) {
			return i;
		} else {
			int d = lastindices(arr, i - 1, item);
			return d;
		}

	}

}
