import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int i, flag = 0;
		for (i = 2; i <= N - 1; i++) {
			if (N % i == 0) {
				flag = 1;

			}
		}
		if (flag == 0) {
			System.out.println(" Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
