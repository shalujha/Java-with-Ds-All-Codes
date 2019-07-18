import java.util.Scanner;


public class triangle {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		System.out.println(triangle(n));

	}
	
	public static int triangle(int n)
	{
		if(n==0)
		{
			return 0;
		}
		
		int sum=0;
		sum=n+triangle(n-1);
		return sum;
	}

}
