import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		int arr[] = takeInput();
		bubblesort(arr);
		display(arr);

	}

	public static int[] takeInput() {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static void bubblesort(int[] arr) {
		int j;
		for (int i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
