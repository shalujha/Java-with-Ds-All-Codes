import java.util.Scanner;

public class kthroot2 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();
		for (int i = 0; i < t; i++) {
			long n = sj.nextLong();
			long k = sj.nextLong();
			long lo = 0;
			long hi = n;
			long ans = 0;
			while (lo <= hi) {
				long mid = (lo + hi) / 2;
				if ((long)Math.pow(mid,k) > n) {
					hi = mid - 1;
				}
				if ((long)Math.pow(mid, k) < n) {
					lo = mid + 1;
				} else {
					ans = mid;
					break;
				}

			}

			System.out.println(ans);
		}

	}

}
