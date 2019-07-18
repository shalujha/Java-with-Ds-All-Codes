import java.util.Scanner;

public class patternrhombus {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int temp = 1;
		int val = 0;
		while (row <= (2 * n - 1)) {
			int csp = 1;
			val=row;
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
			if (row <= (2 * n - 1) / 2) {
				nst = nst + 2;
				nsp--;
				

			} else {
				nst = nst - 2;
				nsp++;
				temp++;

			}
			row++;
		}
	}

}
