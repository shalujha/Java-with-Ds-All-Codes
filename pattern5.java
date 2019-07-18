import java.util.Scanner;


public class pattern5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j,k,n,m=0,p=5;
		Scanner sj=new Scanner(System.in);
		n=sj.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=p;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			m=m+2;
			p=p-1;
			
		}
		m=6;
		p=2;
		for(i=n+1;i<=n+4;i++)
		{
			for(j=1;j<=m;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=p;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			m=m-2;
			p++;
		}
		}
		
		

	}


