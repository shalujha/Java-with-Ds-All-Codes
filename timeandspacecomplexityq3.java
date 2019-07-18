import java.util.Scanner;


public class timeandspacecomplexityq3 {

		public static void main(String[] args) {
	
			Scanner sj=new Scanner(System.in);
			int x=sj.nextInt();
			int n=sj.nextInt();
			int ans=power(x,n);
			System.out.println(ans);

	}
		
		public static int power(int x,int n)
		{
			int ans;
			if(n==0)
			{
				return 1;
			}
			int rr=power(x,n/2);
			if(n%2==0)
			{
				ans=rr*rr;
			}
			else
			{
				ans=rr*rr*x;
			}
			return ans;
				}

}
