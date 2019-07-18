import java.util.Arrays;
import java.util.Scanner;

public class aggressivecows {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int c = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sj.nextInt();
		}
		Arrays.sort(arr);

		System.out.println(ac(c, N, arr));
	}

	public static int ac(int c, int N, int[] arr) {
		int lo = 0;
		int hi = arr[arr.length - 1] - arr[lo];
		int finalAns = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitPossible(mid, c, N, arr)) {
				
				lo = mid + 1;
				finalAns = mid;
			} else {
				hi = mid - 1;
			}

		}
		return finalAns;
	}

	public static boolean isitPossible(int mid, int c, int N, int[] arr) {
		int pos = arr[0];
		int cowPlaced = 1;
		for (int i = 1; i < N; i++) {
			if (arr[i]-pos >= mid) {
				cowPlaced++;
				pos = arr[i];
			}
			if (cowPlaced == c) {
				return true;
			}
		}
		return false;
	}

}
