import java.util.Scanner;

public class reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, reverse = 0, r;
		Scanner gg = new Scanner(System.in);
		System.out.println("enter any no");
		n = gg.nextInt();
		while (n != 0) {
			r = n % 10;
			reverse = reverse * 10 + r;
			n = n / 10;

		}
		System.out.println(reverse);

	}
	

}
