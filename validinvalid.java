import java.util.Scanner;


public class validinvalid {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int a=sj.nextInt();
		int b=sj.nextInt();
		
		int flag=0;
		for(int i=1;i<(n-1);i++)
		{
			int c=sj.nextInt();
		
		if((a>b)&& (b>c))
		{
			flag=0;
		
		}
		if((c>b)&& (b>a))
		{
			flag=0;
		}
		if((a<b)&& (b>c))
		{
			flag=0;
		}
		else
		{
			flag=1;
		}
		b=c;
		a=b;
		}
		if(flag==0)
		{
			System.out.println("true");
		}
		if(flag==1)
		{
			System.out.println("false");
		}
	}

}
