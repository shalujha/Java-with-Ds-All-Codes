import java.util.Scanner;

public class selection {
	static Scanner sj = new Scanner(System.in);

	public static void main(String[] args) {
		long[] arr = takeInput();
		long[] c = selectionsort(arr);
		display(c);

	}

	public static long[] takeInput() {
		int N = sj.nextInt();
		long[] arr = new long[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static long[] selectionsort(long[] arr) {

		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j <= arr.length - 1; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}

			}
			long temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

		}
		return arr;
	}

	public static void display(long[] c) {
		for (int i = 0; i <= c.length - 1; i++) {
			System.out.println(c[i]);
		}

	}

}
