import java.util.Arrays;
import java.util.Scanner;

public class pairofrose {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int T = sj.nextInt();
		for (int k = 0; k < T; k++) {
			int N = sj.nextInt();
			long[] Price = new long[N];
			for (int i = 0; i < N; i++) {
				Price[i] = sj.nextLong();
			}
			int target = sj.nextInt();
			Arrays.sort(Price);
			int lo = 0;
			int hi = Price.length - 1;
			long ans1=0, ans2=0;
			while (lo < hi) {
				if (Price[lo] + Price[hi] > target) {
					hi--;
				} else if (Price[lo] + Price[hi] < target) {
					lo++;
				} else {
					ans1 = Price[lo];
					ans2 = Price[hi];
					lo++;
					hi--;

				}

			}
			
			System.out.println("\t Deepak should buy roses whose prices are " +" "+ ans1 +" "+"and"+ " " + ans2);

		}

	}
}