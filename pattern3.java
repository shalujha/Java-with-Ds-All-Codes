import java.util.Scanner;


public class pattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int row=1;
		int nst=n;
		while(row<=n)
		
		{
			int col=1;
			while(col<=nst)
			{
				System.out.print("*");
				col++;
			}
			System.out.println();
			nst--;
			row++;
		}
		

	}

}
