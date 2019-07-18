import java.util.Scanner;


public class doublesidedarrow {

	
	public static void main(String[] args) {
		int N,row=1,nst=1;
		Scanner sj=new Scanner(System.in);
		N=sj.nextInt();
		while(row<=N)
		{
			int val=row;
		
			int nsp=N-1;
			int csp=row;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp=csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(val);
				val--;
				cst++;
			}
			System.out.println();
			
			nst++;
			nsp--;
			row++;
		}
	}
}
			


	