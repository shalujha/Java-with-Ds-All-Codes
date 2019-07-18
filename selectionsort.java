import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		int arr[] = takeInput();
		selectionsort(arr);
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

	public static void selectionsort(int[] arr) {
		int j;
		for (int i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < (arr.length  - 1); j++) {
				int min = j;
				if (arr[min] > arr[j + 1]) {
					int t = arr[j+1];
					arr[j + 1] = arr[min];
					arr[min] = t;
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
