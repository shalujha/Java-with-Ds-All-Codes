import java.util.Scanner;

public class rec3 {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		recseries(n);

	}

	public static void recseries(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		recseries(n - 1);
		System.out.println(n);

	}

}
