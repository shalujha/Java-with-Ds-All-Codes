import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int[] arr = takeInput();
		insertionsort(arr);
		display(arr);

	}

	public static int[] takeInput() {
		int N;
		Scanner sj = new Scanner(System.in);
		N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static void insertionsort(int[] arr) {
		for (int counter = 1; counter < arr.length; counter++) {
			int temp = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
