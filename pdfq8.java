import java.util.Scanner;


public class pdfq8 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int row=1,nsp=0,nspa=n,nst=1,nsta=1;
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
			int cspa=1;
			while(cspa<=nspa)
			{
				System.out.print(" ");
				cspa++;
			}
		
			int csta=1;
			while(csta<=nsta)
			{
				System.out.print("*");
				csta++;
			}
				System.out.println();
		
			
			nsp++;
			nspa=nspa-2;
			row++;
		}
	}
}
		

		