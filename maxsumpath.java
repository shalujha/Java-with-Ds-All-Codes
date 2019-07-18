import java.util.Scanner;

public class maxsumpath {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sj.nextInt();
			int m = sj.nextInt();
			int[] one = new int[n];
			int[] two = new int[m];
			for (int i = 0; i < one.length; i++) {
				one[i] = sj.nextInt();
			}
			for (int j = 0; j < one.length; j++) {
				two[j] = sj.nextInt();
			}
			int sum1 = 0;
			int sum2 = 0;
			int ans = 0;
			int i = 0;
			int j = 0;
			while (i < one.length && j < two.length) {
				if (one[i] > two[j]) {
					sum2 += two[j];
					j++;
				} else if (one[i] < two[j]) {
					sum1 += one[i];
					i++;
				} else {
					ans += Math.max(sum1, sum2) + one[i];
					i++;
					j++;
					sum1 = 0;
					sum2 = 0;
				}
			}
			if (i == one.length) {
				while (j < two.length) {
					sum2 += two[j];
					j++;

				}
			}
			if (j == two.length) {
				while (i < one.length) {
					sum1 += one[i];
					i++;

				}
			}

			ans += Math.max(sum1, sum2);
			System.out.println(ans);

		}

	}

}
