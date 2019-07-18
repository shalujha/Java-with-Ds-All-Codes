import java.util.Scanner;


public class rotation {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int r,counter=0;
		int n=sj.nextInt();
		int t=sj.nextInt();
		int a=n;
		int b=1;
		
		while(n>0)
		{
			b=b*10;
			n=n/10;
			}
		System.out.println(b/10);
		int i=1,sum=0;
		while(i<=t)
		{
			r=a%10;
			sum=sum+r+b;
			a=a/10;
		
		System.out.println(sum);
		i++;
		}
}
}