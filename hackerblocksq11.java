import java.util.Scanner;


public class hackerblocksq11 {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int	N=sj.nextInt();
		int row=1;
		int nst=1;
		
		while(row<=N)
		{
			
			int cst=1;
			while(cst<=nst)
			{
				if(row<=2)
				{
				System.out.print(row);
				}
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
			System.out.println();
			nst++;
			row++;
			}
			
		}

	}


