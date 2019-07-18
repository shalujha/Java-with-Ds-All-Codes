import java.util.Scanner;

public class firstindex {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int item = sj.nextInt();
		int vidx = 0;
		int c = findingfirstindex(arr, vidx, item);
		System.out.println(c);

	}

	public static int findingfirstindex(int[] arr, int vidx, int item) {
		if (vidx == arr.length) {
			return -1;
		}
		if (arr[vidx] == item) {
			return vidx;
		}
		int recans = findingfirstindex(arr, vidx+1, item);
		return recans;
	}

}
