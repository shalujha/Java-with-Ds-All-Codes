import java.util.Scanner;


public class hackerblocksq30 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int[]arr=new int[N];
		int sum=0,ans;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sj.nextInt();
		}
	int	operations=sj.nextInt();
	for(int j=1;j<=operations;j++)
	{
		int X=sj.nextInt();
		for(int i=0;i<N;i++)
		{
			if(X!=0)
			{
			arr[i]=arr[i]+arr[N-i];
			}
			else
			{
				arr[i]=arr[i]+arr[i];
			}
			
		}
	}
		for(int i=0;i<N;i++)
		{
			sum=sum+arr[i];
		}
		ans=sum%(10^9+7);
		System.out.println(ans);
		}
	}


