import java.util.Scanner;


public class mountainwala {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int row=1,N;
		N=sj.nextInt();
		
		
		
		
		
		while(row<=N)
		{
			int cst=1;
			int counter=row;
			int nst=row;
			int nsp=N-1;
			int nsta=row;
			int val=1;
			int csta=1;
			int nspa=N-2;
			while(cst<=nst)
			{
				System.out.print(val);
				val++;
				cst++;
				
			}
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cspa=1;
			while(cspa<nspa)
			{
				System.out.print(" ");
				cspa++;
			}
			
			while(csta<=nsta)
			{
				if (row==N)
				{
					counter=N-1;
				}
				else
				{
				counter=row;
			}
				System.out.print(counter);
				counter--;
				cst++;
			}
			System.out.println();
			nsp=nsp--;
			nspa--;
			
			row++;
			
			
				
			}
			
		}
		
		
		

	}


