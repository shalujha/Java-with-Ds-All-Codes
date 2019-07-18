import java.util.Scanner;


public class pattern19 {

	
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
			int i=row;
			int nr=nst/2;
			while(cst<=nst)
			{
				if(cst==1 || cst==nst)
				{
				System.out.print(i);
				}
				if(cst>1 && cst<nst)
				{
				
				{
					System.out.print(i++);
					i++;
				}
				if(cst>nr)
				{
					System.out.print(i--);
					i--;
				}
				}
				
				cst++;
				}
			
		nsp--;
			nst=nst+2;
			
			System.out.println();
			row++;
			nr=nst/2;
		}
	}
}		