import java.util.Scanner;


public class pdfq5 {

	public static void main(String[] args) {
		int row=1,n,nsp=0;
		Scanner sj=new Scanner(System.in);
		n=sj.nextInt();
		int nst=n;
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
			System.out.println();
			nst--;
			nsp++;
			row++;
			 
			
		}
	}

}
