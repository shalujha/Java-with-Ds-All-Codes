import java.util.Scanner;


public class rotation1 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int rotation=sj.nextInt();	
		int ans=0;
		
	
			for(int i=1;i<=rotation;i++)
			{
			int r=n%10;
			int c=noOfdigits(n);
			 ans=r*(int)Math.pow(10,c)+n;
			  n=n/10;
		}
			System.out.println(ans);
		
	}
		
		
		public static  int noOfdigits(int t)
		{
			int count=0;
			while(t!=0)
			{
				int r=t%10;
				count++;
				t/=10;
			}
			return count;
		}

	}


