import java.util.Scanner;


public class pattern14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int row=1,n,nst=1,i=1;
		Scanner sj=new Scanner(System.in);
		n=sj.nextInt();
		while(row<=n)
		{
			int cst=1;
			
			while(cst<=nst)
			{ 
				
				System.out.print(i);
				cst++;
				i++;
			}
			nst++;
			System.out.println();
			row++;
		}

	}

}
