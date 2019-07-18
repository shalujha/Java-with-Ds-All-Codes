import java.util.Scanner;


public class hackerblocksq2 {

	public static void main(String[] args){ 
		
		
		Scanner sj=new Scanner(System.in);
		int N,a,b,c,i;
		N=sj.nextInt();
		a=0;b=1;
		for(i=0;i<=N;i++)
		{
			
			c=a+b;
			
			b=c;
			a=b;
		}
		System.out.println(a);
		

	}

}
