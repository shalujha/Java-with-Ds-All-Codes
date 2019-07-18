import java.util.Scanner;


public class pattern7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row=1;
		int col=1,n;
		Scanner gg=new Scanner(System.in);
		n=gg.nextInt();
		while(row<=n)
		{
			while(col<=n)
			{
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			col=1;
		}
		

	}

}
