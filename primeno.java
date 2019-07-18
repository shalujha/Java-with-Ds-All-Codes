import java.util.Scanner;

public class primeno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i;
		int flag = 0;
		Scanner gg = new Scanner(System.in);
		System.out.println("enter any no");
		n = gg.nextInt();
		for (i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				flag = 1;
			}
		}
		if (flag ==0) {
			System.out.println("no is prime");
		} else {
			System.out.println("no is not prime");
		}

	}

}
