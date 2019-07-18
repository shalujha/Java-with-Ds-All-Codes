import java.util.Scanner;


public class pattern12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner gg=new Scanner(System.in);
		int n=gg.nextInt();
		int row=1,nsp=0,nst=n;
		while(row<=n)
		{
			int csp=0;
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
			nsp++;
			nst--;
			System.out.println();
			row++;
		}
		

	}

}
