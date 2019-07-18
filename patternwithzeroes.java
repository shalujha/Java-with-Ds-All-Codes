import java.util.Scanner;


public class patternwithzeroes {

	
	public static void main(String[] args) {
		
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int row=1;
		int nst=1;
		int val=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{
				if(row>=2)
				{
				if(cst !=1 && cst!=nst)
				{
				System.out.print("0 ");
				}else
				{
					System.out.print(val+" ");
				}
				}else
				{
				System.out.print(val +" ");
				}
				cst++;
			}
			System.out.println();
			nst++;
			val++;
			row++;
		}
	}

}
