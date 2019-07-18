import java.util.Scanner;

public class isarraymirrorinverse {

	static Scanner sj = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		boolean c = mirrorinverse(arr);
		System.out.println(c);

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

	public static boolean mirrorinverse(int[] arr) {
		int[] d = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			arr[i] = i;
			d[temp] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			
				if (arr[i] != d[i]) {
					return false;

				}
			
		}
		return true;
	}

}