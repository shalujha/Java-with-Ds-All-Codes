import java.util.Scanner;

public class timeandspacecomplexityq1 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int X = sj.nextInt();
		int n = sj.nextInt();
		int power = X;
		int sum = 0;
		for (int coeff = n; coeff >= 1; coeff--) {
			sum = sum + coeff * power;
			power = power * X;
		}
		System.out.println(sum);
	}

}
