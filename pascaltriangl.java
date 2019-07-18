import java.util.Scanner;


public class pascaltriangl {

	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int row=1;
		int nst=1;
		int val=1;
		System.out.println(val);
		
		while(row<=N)
		{
			 
			int cst=0;
			val=1;
			while(cst<=nst)
			{
					
				System.out.print(val);
				val=(val*(row-cst))/(cst+1);
			
				
				cst++;
			}
			System.out.println();
			nst++;
		
		row++;
		}
	}


}