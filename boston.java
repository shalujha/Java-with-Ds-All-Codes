import java.util.Scanner;

public class boston {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int temp = N;
		int digitsum = 0;
		int r;
		while (temp != 0) {
			r = temp % 10;
			digitsum = digitsum + r;
			temp = temp / 10;

		}
		int factorsum = 0;
		while (N % 2 == 0) {
			factorsum = factorsum + 2;
			N = N / 2;
		}

		for (int i = 3; i <= Math.sqrt(N); i = i + 2) {
			while (N % i == 0) {
				int t = i;
				while (t != 0) {
					int rem = t % 10;
					factorsum = factorsum + rem;
					t = t / 10;
				}

				N = N / i;

			}

		}

		if (N > 1) {
			while (N != 0) {
				int rem = N % 10;
				factorsum = factorsum + rem;
				N = N / 10;
			}
		}

		if (digitsum == factorsum) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
