import java.util.Scanner;

public class countbpbydp {
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		System.out.println(countBoardpath(0, n));
		System.out.println(countBoardpathI(0, n));
	}

	public static int countBoardpath(int curr, int end) {
		if (curr == end) {
			return 1;

		}
		if (curr > end) {
			return 0;
		}
		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count += countBoardpath(curr + dice, end);
		}
		return count;
	}

	public static int countBoardpathI(int curr, int end) {
		int[] strg = new int[end + 1];
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int count = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				count = count + strg[dice + i];
			}
			strg[i] = count;
		}
		return strg[0];
	}

}
