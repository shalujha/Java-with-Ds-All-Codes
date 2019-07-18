import java.util.Scanner;


public class pattern15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row=1,N,nst=1;
		Scanner gg=new Scanner(System.in);
		N=gg.nextInt();
		while(row<=N)
		{
			int cst=1;
			while(cst<=nst)
			{
				if(row<=2)
			 System.out.print(row);
			if(row>2)
			{
				if(cst==1 || cst==nst)
				{
					System.out.print(row);
				}
				else
				{
					System.out.print("0");
				}
			}
			
			cst++;
			}
			nst++;
			System.out.println();
			row++;
		}

	}

}