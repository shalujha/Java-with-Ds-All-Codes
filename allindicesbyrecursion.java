import java.util.Scanner;

public class allindicesbyrecursion {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int i = 0;
		int count = 0;
		int item = sj.nextInt();
		int[] c = allindex(arr, i, item, count);
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
	}

	public static int[] allindex(int[] arr, int i, int item, int count) {
		if (i == arr.length) {
			int[] bres = new int[count];
			return bres;
		}
		int[] recans;
		if (arr[i] == item) {
			recans = allindex(arr, i + 1, item, count + 1);
			recans[count] = i;
		} else {
			recans = allindex(arr, i + 1, item, count);
		}
		return recans;
	}

}
