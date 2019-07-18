import java.util.Scanner;


public class pattern21 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N,row=1,nst=1;
		N=sj.nextInt();
	int	nsp=N-1;
		while(row<=N)
		{
			int csp=1;
		int	i=row;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				if(cst<=nst/2)
				{
				System.out.print(" "+i);
				i++;
				}
				else
				{
					System.out.print(" "+i);
				i--;
			}
				cst++;
				
			}
			nsp--;
			nst=nst+2;
			
			System.out.println();
			row++;		
			
		}
		

	}

}
