import java.util.Scanner;

public class binarysearch {
		static Scanner sj = new Scanner(System.in);
	public static void main(String[] args) {
		int c;
		int[] arr = takeInput();
		c = binarysearch(arr);
		System.out.println("element found at" + c);

	}

	public static int[] takeInput() {
		

		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();

		}
		return arr;

	}

	public static int binarysearch(int[] arr) {
		
		int low = 0;
		int high = arr.length - 1;

		int val = sj.nextInt();
		while (low <= high) {
			int mid = (low + high) / 2;
			if (val > arr[mid]) {
				low = mid + 1;
			} else if (val < arr[mid]) {
				high = mid - 1;
			} else if (val == arr[mid]) {
				return mid;
			}
		}

		return -1;
	}

}
