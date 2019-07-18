import java.util.Scanner;

public class bubble {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int[] arr = takeInput();
		bubblesort(arr);
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

	public static void bubblesort(int[] arr) {
		int t;

		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - counter - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}

		// return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
