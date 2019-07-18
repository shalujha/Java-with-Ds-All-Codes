import java.util.Scanner;


public class hackeblocksq30 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int b=N;
		int counter=0,sum=0,r,a=0;
		for(int p=2;p<=N;p++)
		{
			 
			while(N%p==0)
			{
				sum=sum+p;
				N=N/p;
			}
		}
		while(b!=0)
		{
			r=b%10;
			a=a+r;
			b=b/10;
			
		}
		if(sum==a)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
			
	}
		
}
