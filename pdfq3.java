import java.util.Scanner;


public class pdfq3 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int row=1,n;
		n=sj.nextInt();
		int nst=n;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			nst--;
			row++;
		}



	}

}
