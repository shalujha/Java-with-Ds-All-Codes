import java.util.Scanner;

public class playingwithnumbersystem {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}

		int val = 0;
		for (int counter = 1; counter <= arr.length - 1; counter++) {
			val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] >val) {
				arr[j+1] = arr[j ];
				j--;
			}
			arr[j + 1] = val;
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
