import java.util.Scanner;


public class hackerblocksq5 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int i,a,b,c;
		a=0;b=1;
		for(i=0;i<=N;i++)
		{
			if(a>N)
			{
				break;
			}
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
