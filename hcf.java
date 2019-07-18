import java.util.Scanner;

public class hcf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend, divisor, remainder;
		Scanner gg = new Scanner(System.in);
		System.out.println("enter any no");
		dividend = gg.nextInt();
		divisor = gg.nextInt();
		while (dividend % divisor != 0) {
			remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		System.out.println(divisor);
	}
}
