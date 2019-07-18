import java.util.Scanner;


public class fibonacciterm {

		public static void main(String[] args) {
	
			Scanner sj=new Scanner(System.in);
			int n=sj.nextInt();
			int c=fibonacci( n);
			System.out.println(c);

	}
		
		public static int fibonacci(int n)
		{
			if(n==0)
			{
				return 0;
			}
			if(n==1)
			{
				return 1;
			}
			
			int d=fibonacci(n-1);
			int m=fibonacci(n-2);
			int ans=d+m;
			return ans;
		}

}
