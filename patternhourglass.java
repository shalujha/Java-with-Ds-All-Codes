import java.util.Scanner;

public class patternhourglass {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int nsp = 0;
		int nst = N;
		int val;
		int row = 0;
		while (row < N) {
			int csp = 1;
			if(row<N/2)
			{
			 val = (N / 2)-row;
			}
			else
			{
				val++;;
			}
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val);
				if (cst <= nst / 2) {
					val--;
				} else {
					val++;
				}

				cst++;
			}

			System.out.println();
			if (row <= N / 2) {
				nst = nst - 2;
				nsp++;
			} else {
				nsp--;
				nst = nst + 2;
			}
			
			row++;
		}

	}

}
