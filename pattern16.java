import java.util.Scanner;


public class pattern16 {

	
	public static void main(String[] args) {
		int row=1,a=0,b=1,N,c,nst=1;
	Scanner sj=new Scanner(System.in);
	N=sj.nextInt();
	while(row<=N)
	{
		int cst=1;
		while(cst<=nst)
		{
			System.out.print("  "+a);
			c=a+b;
			a=b;
			b=c;
			cst++;
		}
		nst++;
		System.out.println();
		row++;
		
	}
	}
}

	
		
		