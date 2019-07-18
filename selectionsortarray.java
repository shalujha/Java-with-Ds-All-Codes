import java.util.Scanner;

public class selectionsortarray {
	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int[] arr = takeInput();
		selectionsort(arr);
		display(arr);

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

	public static void selectionsort(int[] arr) {
		int t;

		for (int counter = 0; counter < arr.length - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			t = arr[min];
			arr[min] = arr[counter];
			arr[counter] = t;
		}

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
