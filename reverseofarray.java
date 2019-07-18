import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		int[] arr = takeInput();
		arr = reverse(arr);
		display(arr);
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

	public static int[] reverse(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int t;
		for (int i = 0; i < arr.length / 2; i++) {
			t = arr[low];
			arr[low] = arr[high];
			arr[high] = t;
			low++;
			high--;
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
