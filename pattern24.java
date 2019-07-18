import java.util.Scanner;


public class pattern24 {

	
	public static void main(String[] args) {
		Scanner gg=new Scanner(System.in);
		int N,row=1,nst=1;
		N=gg.nextInt();
		int  nsp=N-3;
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
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<=N/2)
			{
				nsp--;
				nst=nst+2;
			}
			if(row>N/2)
			{
				nsp++;
				nst=nst-2;
			}
			row++;
		}
	}

}
