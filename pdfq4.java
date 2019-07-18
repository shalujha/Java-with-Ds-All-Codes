import java.util.Scanner;


public class pdfq4 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n,row=1;
		n=sj.nextInt();
		int nst=1;
		int nsp=n-1;
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
			System.out.println();
			row++;
		}
		
	}

}
