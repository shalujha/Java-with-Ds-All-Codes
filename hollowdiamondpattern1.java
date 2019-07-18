import java.util.Scanner;

public class hollowdiamondpattern1 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int nst = n;
		int row = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				if (row == 1 || row == n) {
					System.out.print("* ");
				} else {
					if (row % 2 == 0) {
						if (cst == (n / 2) + 1) {
							System.out.print("  ");
						}else
						{
							System.out.print("* ");
						}
					} else {
						if (cst != 1 && cst != nst) {
							System.out.print("  ");
						}else
						{
							System.out.print("* ");
						}
					}
				}
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
