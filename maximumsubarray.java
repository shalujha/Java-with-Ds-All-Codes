import java.util.Scanner;

public class maximumsubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
			Scanner sj=new Scanner(System.in);
			int t=sj.nextInt();
			for(int k=0;k<t;k++)
			{
				int n=sj.nextInt();
				long[] A=new long[n];
				for(int i=0;i<n;i++)
				{
					A[i]=sj.nextLong();
				}
				
				long sum=0;
				long max=Integer.MIN_VALUE;
				for(int i=0;i<A.length;i++)
				{
					sum+=A[i];
					if(max<sum)
					{
						max=sum;
						
					}
					if(sum<0)
					{
						sum=0;
					}
				}
				
				System.out.println(max);
				
			}
		}
	}
}




	
		
	