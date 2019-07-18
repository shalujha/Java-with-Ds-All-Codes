import java.util.Scanner;

public class firstindexbyrecursion {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int i = 0;
		int item = sj.nextInt();
		int c = firstindices(arr, i, item);
		System.out.println(c);

	}

	public static int firstindices(int[] arr, int i, int item) {
		if (i == arr.length ) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		} else {
			int d = firstindices(arr, i + 1, item);
			return d;
		}
	}

}
