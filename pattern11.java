import java.util.Scanner;


public class pattern11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner gg=new Scanner(System.in);
		int n,nst=1;
		n=gg.nextInt();
		int nsp=n-1;
		int row=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			nsp--;
			nst++;
			row++;
			System.out.println();
		}
		
		

	}

}
