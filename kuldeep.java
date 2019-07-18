import java.util.Scanner;

public class kuldeep {
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);

		int n = sj.nextInt();
		int row = 1;
		int nst = 1;
		int val = 1;
		int nsp = n - 1;
		while (row <= n + 1) {
			if (row % 2 == 0) {
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					csp++;
				}
				int cst = 1;

				while (cst <= nst) {
					if (cst % 2 == 0) {
						System.out.print("* ");
					}
					if (cst % 2 != 0) {
						System.out.print(val + " ");
						val++;
					}
					cst++;
				}

			} else {
				int cst = 1;
				while (cst <= nst) {
					if (cst % 2 == 0) {
						System.out.print("* ");
					}
					if (cst % 2 != 0) {
						System.out.print(val + " ");
						val++;
					}
					cst++;
				}
			}
			System.out.println();
			nst = nst + 2;
			nsp=(nsp*2)+2;
			row++;
		}
	}
}
