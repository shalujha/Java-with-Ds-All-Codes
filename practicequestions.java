import java.util.Scanner;

public class practicequestions {
	static Scanner sj = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sj.nextInt();
		int[] arr = new int[N];
		int[] c = takeInput(arr);
		boolean k = Inverse(c);
		System.out.println(k);
	}

	public static int[] takeInput(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static boolean Inverse(int[] arr) {
		int[] d = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			int temp = arr[j];
			d[temp] = j;
		}
		for (int k = 0; k < d.length; k++) {
			if (d[k] != arr[k]) {
				return false;
			}
		}
		return true;
	}

}
