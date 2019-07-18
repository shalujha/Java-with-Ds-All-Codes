import java.util.Scanner;

public class patterntriangle {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int nsp = N - 1;
		int nst = 1;
		int row = 1;
		while (row <= N) {
			int val = row;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				if (cst <= nst / 2) {
					val++;
				} else {
					val--;
				}
				cst++;
			}
			System.out.println();
			nsp--;
			nst = nst + 2;
			row++;

		}
	}

}
