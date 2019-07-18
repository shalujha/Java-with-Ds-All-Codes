import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		int c;
		int[] arr = takeInput();
		c = max(arr);
		System.out.println(c);

	}

	public static int[] takeInput() {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static int max(int[] arr) {
		int d = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (d < arr[i]) {
				d = arr[i];
			}
		}
		return d;
	}

}
