import java.util.Scanner;

public class patternmountain {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int nst = 1;
		int nsp = n + 2;
		int row = 1;
		
		while (row <= n) {
			int cst = 1;
			int val=1;
			while (cst <= nst) {
				if(row==n && cst==nst)
				{
				System.out.print("  ");	
				}else
				{
				System.out.print(val+" ");
				}
				cst++;
				val++;
			}
			int temp=val-1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst1=1;
			while (cst1 <= nst) {
				System.out.print(temp+" ");
				temp--;
				cst1++;
			}
			System.out.println();
			nst++;
			nsp = nsp - 2;
			row++;
		}

	}
}
