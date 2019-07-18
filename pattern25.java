import java.util.Scanner;


public class pattern25 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int row=1;
	int	N=sj.nextInt();
	int	nst=N/2;
	int nsp=1;
	while(row<=N)
	{
		if(row==1 || row==N)
		{
			int c=1;
			while(c<=N)
			{
				System.out.print("*");
				c++;
			}
			System.out.println();
			row++;
		}
		else
		{
			int cst=1;
			while(cst<=nst/2)
			{
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int csta=1;
			
			while(csta<=nst/2)
			{
				System.out.print("*");
				csta++;
			}
		}
		System.out.println();
		
		if(row<=N/2)
		{
			nst=nst+1;
			nsp=nsp-2;
		}
		else
		{
			nst=nst-1;
			nsp=nsp-2;
		}
		
		row++;
		
	}
	}
}
			
		
		
		
		
									