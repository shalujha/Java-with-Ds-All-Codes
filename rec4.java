import java.util.Scanner;

public class rec4 {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		recseries(n);

	}

	public static void recseries(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		recseries(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

}
