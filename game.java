import java.util.Scanner;


public class game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int M,N,i,T;
		Scanner sj=new Scanner(System.in);
		T=sj.nextInt();
		
		for(i=1;i<=T;i++)
		{
			M=sj.nextInt();
			N=sj.nextInt();
			for(int j=1;j<=M;j++)
			{
				for(int k=i+1;k<=N;k++)
				{
			if(M>N)
			{
				System.out.println("Akshay");
				break;
				
			}
				}
			}
			if(N>M)
			{
				System.out.println("Harshit");
				break;
			}
		
			
			
	}

	}
}

