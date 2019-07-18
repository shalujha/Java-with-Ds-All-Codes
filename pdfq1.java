import java.util.Scanner;


public class pdfq1 {

	
	public static void main(String[] args) {
		int row=1,n,nst=1;
		Scanner sj=new Scanner(System.in);
		n=sj.nextInt();
		while(row<=n)
		{
			int cst=1;
			while(cst<=n)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			
			row++;
			
		}
	}

}
