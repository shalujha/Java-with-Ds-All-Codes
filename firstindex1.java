import java.util.Scanner;

public class firstindex1 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		int item = sj.nextInt();
		System.out.println(firstIndex(arr, 0, item));
	}
	
	public static int firstIndex(int[] arr, int i, int item) {
		int c;
		if (i == arr.length) {
			return -1;
		}
		if (item == arr[i]) {
			return i;
		} else {
			c = firstIndex(arr, i + 1, item);
		}
		return c;
	}
}
