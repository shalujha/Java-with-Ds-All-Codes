import java.util.Scanner;


public class pattern10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nst=5,n,row=1;
		Scanner gg=new Scanner(System.in);
		n=gg.nextInt();
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			nst--;
			System.out.println();
			row++;
			
			
		}
		

	}

}
