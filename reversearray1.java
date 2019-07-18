import java.util.Scanner;

public class reversearray1 {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int[] arr = takeInput();
		int[] a = reverse(arr);
		display(a);

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

	public static int[] reverse(int[] arr) {
		int t;
		for (int i = 0; i < arr.length / 2; i++) {
			t = arr[i];

			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - 1 - i] = t;
		}
		return arr;
	}

	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
