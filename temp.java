import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int c, i, f;
		int maxF = sj.nextInt();
		int minF = sj.nextInt();
		int step = sj.nextInt();
		for (i = minF; i <= maxF; i = i + step) {
			c = (int) ((5.0 / 9) * (i - 32));
			System.out.println(i + "\t " + c);
		}

	}

}
