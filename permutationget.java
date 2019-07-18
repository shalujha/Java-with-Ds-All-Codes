import java.util.Scanner;

public class permutationget {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		long number = sj.nextInt();
		long reverse = 0;
		while (number != 0) {
			long r = number % 10;
			if (r >= 5 && (r != 9)) {

				r = 9 - r;

			}
			reverse = reverse * 10 + r;
			number /= 10;
		}
		long ulta = 0;
		while (reverse != 0) {
			long r = reverse % 10;
			ulta = ulta * 10 + r;
			reverse /= 10;
		}

		System.out.println(ulta);

	}

}
