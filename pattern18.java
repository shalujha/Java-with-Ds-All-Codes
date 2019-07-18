import java.util.Scanner;


public class pattern18 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N,row=1,nst=1;
		N=sj.nextInt();
		int nsp=N-1;
		while(row<=N)
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
				if(cst%2==0)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				cst++;
			}
			int nr=N/2;
			if(row<=nr)
			{
				nsp=nsp-2;
				nst=nst+4;
				
			}
			if(row>nr)
			{
				nsp=nsp+2;
				nst=nst-4;
				
			}
			System.out.println();
			row++;
		}
	}
}