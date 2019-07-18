import java.util.Scanner;


public class pdq2 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int row=1,n,nst=1;
		n=sj.nextInt();
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}

	}

}
