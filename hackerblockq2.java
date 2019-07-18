import java.util.Scanner;


public class hackerblockq2 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N,a,b,c,i;
		N=sj.nextInt();
		a=0;b=1;
		for(i=1;i<=N;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
		
		
		}

}
