import java.util.Scanner;


public class hollowdiamondpattern {

	
	public static void main(String[] args) {
		int N,row=1;
		Scanner sj=new Scanner(System.in);
		N=sj.nextInt();
		int nst=N;
		
		while(row<=N)
		{
			int cst=1;
			while(cst<=nst)
			{
				if(row==1 || row==N)
				{
					System.out.print("*");
					cst++;
				}
				if(row>1 && row<N)
				{
					if(row%2==0)
					{
						if(cst==nst/2)
						{
							System.out.print(" ");
							cst++;
						}
						else
						{
							System.out.print("*");
							cst++;
						}
					}
					if(row%2!=0)
					{
					if(cst>1 && cst<nst)
					{
						System.out.print(" ");
						cst++;
					}
					else
					{
						System.out.print("*");
						cst++;
					}
				}
						
					}
				
				}
			cst++;
		}
		
			System.out.println();
			row++;
			
			
		}
		
		
	}


