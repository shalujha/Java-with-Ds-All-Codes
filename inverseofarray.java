import java.util.Scanner;

public class inverseofarray {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int[] arr = takeInput();

		int r = sj.nextInt();
		int[] b = rotation(arr, r);
		// int[]a=inverse(arr);
		display(b);

	}

	public static int[] takeInput() {
		int n;
		Scanner sj = new Scanner(System.in);
		n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static int[] rotation(int[] arr, int r) {

		Scanner sj = new Scanner(System.in);
		int[] b = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (i < r) {
				b[i] = arr[i+arr.length -r];
			} else {
				b[i] = arr[i - r];
			}
		}
		return b;

	}

	public static void display(int[] b) {
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
