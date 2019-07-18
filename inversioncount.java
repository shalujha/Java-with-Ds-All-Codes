import java.util.Scanner;


public class inversioncount {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int t=sj.nextInt();
		for(int k=0;k<t;k++)
		{
			int N=sj.nextInt();
			long[] A=new long[N];
			int counter=0;
			for(int i=0;i<A.length;i++)
			{
				A[i]=sj.nextLong();
			}
			for(int i=0;i<A.length;i++)
			{
				for(int j=i+1;j<A.length;j++)
				{
					if((A[i]>A[j]) && (i<j) )
					{
						counter++;
					}
				}
			}
			System.out.println(counter);
			
		}
		
	}

}
