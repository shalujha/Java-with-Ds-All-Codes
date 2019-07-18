import java.util.Scanner;

public class patternrhombus1 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		int temp = 0;
		int val = 0;
		while (row <= (2 * n - 1)) {
			if (row <= (2 * n - 1) / 2) {
				val = row;
			} else {
				val = row - temp;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val + " ");
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
				temp=temp+2;
			}
			row++;
		}

	}

}
