import java.util.Scanner;


public class pattern9 {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int row=1;
		int nst=5;
		while(row<=n)
		{
			int cst=nst;
			while(cst>=nst)
			{
				System.out.print("*");
				cst--;
			}
			System.out.println();
			nst--;
			row++;
			
		}

	}

}
