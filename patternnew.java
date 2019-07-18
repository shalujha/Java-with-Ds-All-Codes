import java.util.Scanner;
public class patternnew {
	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int nst = 1;
		int nsta = 1;
		int nsp = N + 1;
		int row = 1;
		int val;
		while (row <= N) {
			int cst = 1;
			val = 1;
			while (cst <=nst) {
				System.out.print(val);
				val++;
				cst++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int csta = 1;

			val = row;
			while (csta <= nsta) {
				if(val!=4)
				{
				System.out.print(val);
				}
				val--;
				csta++;
			}
			System.out.println();
			nst++;
			nsta++;
			nsp = nsp - 2;
			row++;

		}
	}

}
