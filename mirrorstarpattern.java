import java.util.Scanner;

public class mirrorstarpattern {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = (n-1) / 2;
		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if (row <= n / 2) {
				nst=nst+2;
			} else {
				nst=nst-2;
			}
			if (row <= n / 2) {
				nsp--;
			} else {
				nsp++;
			}
			row++;
		}

	}

}
