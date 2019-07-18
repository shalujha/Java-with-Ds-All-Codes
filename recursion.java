import java.util.Scanner;


public class recursion {
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		printDecInc(n);

	}
	public static void printDecInc(int n)
	{
		if(n==0)
		{
			return;
		}
		if(n%2!=0)
		{
		System.out.println(n);
		}
		printDecInc( n-1);
		if(n%2==0)
		System.out.println(n);
		
	}

}
