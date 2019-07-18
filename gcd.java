import java.util.Scanner;


public class gcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dividend,divisor,remainder;
		Scanner sj=new Scanner(System.in);
		dividend=sj.nextInt();
		divisor=sj.nextInt();
		while(dividend%divisor!=0)
		{
			remainder=dividend%divisor;
			divisor=remainder;
		}
		System.out.println(divisor);

	}

}
