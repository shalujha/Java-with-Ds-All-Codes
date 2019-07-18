import java.util.Scanner;


public class hackerblocksq12 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int row=1,nst=1,nsp=N-1;
		while(row<=N)
		{
			int csp=1;
			int val=row;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				if(cst<=nst/2)
				{
				System.out.print("  "+val);
				val++;
				}
				else
				{
					System.out.print("  "+val);
					val--;
					
					
				}
				cst++;
			}
			System.out.println();
			nst=nst+2;
			nsp--;
			row++;
		}
	}
}
			


