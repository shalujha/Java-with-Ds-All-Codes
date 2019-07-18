import java.util.Scanner;

public class kthroot {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();																								 		/* 2
																																	10000 1
																																	1000000000000000 10*/

		for(int i=0;i<t;i++)
		{
			int ans=0;
			int max=Integer.MIN_VALUE;
			long n=sj.nextLong();
			int k=sj.nextInt();
			for(int x=1;x<=n;x++)
			{
				ans=(int)Math.pow(x, k);
				if(ans<=n)
				{
					if(x>max)
					{
						max=x;
					}
				}else
				{
					break;
				}
				
			}
			System.out.println(max);
			
		}

	}

}
