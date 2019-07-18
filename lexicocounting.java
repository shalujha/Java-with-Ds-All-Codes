import java.util.Scanner;

public class lexicocounting {

	
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		lexico(0, 1000);

	}

	public static void lexico(int curr, int end) {
		if (curr > end) {

			return;
		}
		System.out.println(curr);

		int i = 0;

		if (curr == 0)
			i = 1;
		for (; i <= 9; i++) {
			lexico(curr * 10 + i, end);
		}

	}

}
