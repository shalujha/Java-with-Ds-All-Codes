import java.util.Scanner;

public class endingindex {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int item = sj.nextInt();
		int vidx = 0;
		int c = findingendindex(arr, vidx, item);
		System.out.println(c);

	}

	public static int findingendindex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		int recans = findingendindex(arr, vidx + 1, item);
		if (arr[vidx] == item && recans == -1) {
			return vidx;
		}
		return recans;

	}

}
