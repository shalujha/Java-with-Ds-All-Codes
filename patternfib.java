import java.util.Scanner;


public class patternfib {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int row=1;
		int nst=1;
		int a=0;
		int b=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				int c=a+b;
				System.out.print(a +" ");
				a=b;
				b=c;
			cst++;
			}
			System.out.println();
			nst++;
			row++;
		}
		

	}

}
