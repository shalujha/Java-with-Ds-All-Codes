import java.util.Scanner;


public class fibonacciusingrecursion {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int c=fibonacci(n);
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
		int fnm1=fibonacci(n-1);
		int fnm2=fibonacci(n-2);
		int fn=fnm1+fnm2;
		
		return fn;
	}
}
