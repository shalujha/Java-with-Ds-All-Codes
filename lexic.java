import java.util.Scanner;

public class lexic {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		lexico(0, N);

	}

	public static void lexico(int curr, int end) {
		if (curr > end) {
			return;
		}

		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			lexico(curr * 10 + i, end);
		}
	}

}