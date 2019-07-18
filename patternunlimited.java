import java.util.Scanner;


public class patternunlimited {

	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int row=1;
		int nsp=N-1;
		int nst=1;
		while(row<=N)
		{
			int csp=1;
			int val=row;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<nst)
			{
				System.out.print(val);
				val--;
				cst++;
			}
			System.out.println();
				nsp=nsp-2;
			nst++;
			row++;
			
		}

	}

}
