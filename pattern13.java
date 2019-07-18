import java.util.Scanner;


public class pattern13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner gg=new Scanner(System.in);
		int n=gg.nextInt();
		int row=1;
		int nst=1;
		int nr=2*n-1;
		while(row<=nr)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
				
			}
			if(row<=nr/2)
			{
				nst++;
			}
			else
			{
				nst--;
			}
			System.out.println();
			row++;
		}

	}

}
