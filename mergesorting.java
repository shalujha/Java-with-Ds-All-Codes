import java.util.Scanner;

public class mergesorting {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sj.nextInt();
		}
		int lo = 0;
		int hi = N - 1;
		int[] ans = mergesorting(arr, lo, hi);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

	public static int[] mergesorting(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;
		int[] fh = mergesorting(arr, lo, mid);
		int[] sh = mergesorting(arr, mid + 1, hi);
		int[] sorted = merge2sortedarrays(fh, sh);
		return sorted;
	}

	public static int[] merge2sortedarrays(int[] fh, int[] sh) {
		int[] merge = new int[fh.length + sh.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < fh.length && j < sh.length) {
			if (fh[i] < sh[j]) {
				merge[k] = fh[i];
				i++;
				k++;
			} else {
				merge[k] = sh[j];
				j++;
				k++;
			}
		}
		if (i == fh.length) {
			while (j < sh.length) {
				merge[k] = sh[j];
				j++;
				k++;
			}
		}
		if (j == sh.length) {
			while (i < fh.length) {
				merge[k] = fh[i];
				i++;
				k++;
			}
		}
		return merge;

	}

}
