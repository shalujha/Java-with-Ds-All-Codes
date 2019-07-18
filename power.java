import java.util.Scanner;


public class power {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int x=sj.nextInt();
		int n=sj.nextInt();
	int	c=power(x,n);
	System.out.println(c);

	}
	
	public static int power(int x,int n)
	{
		if(n==0)
		{
			return 0;
		}
		int a=(int)Math.pow(x,n-1);
		int power=x*a;
		
		return power;
	}


}
