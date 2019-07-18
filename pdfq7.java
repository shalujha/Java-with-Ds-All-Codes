import java.util.Scanner;


public class pdfq7 {

	
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
				if(row==1 || row==n)
				{
					System.out.print(" *");
				}
				else
				{
					if(cst==1 || cst==nst)
					{
						System.out.print(" *");
					}
					else
					{
						System.out.print("  ");
					}
				}
					cst++;
				}
				row++;
				System.out.println();
			}
		}
		
		
			}
		

	


