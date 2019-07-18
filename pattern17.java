import java.util.Scanner;


public class pattern17 {
	public static void main(String[] args) {
		int a=0,b=1,c,i,n,j;
		Scanner sj=new Scanner(System.in);
		 n=sj.nextInt();
	for(i=1;i<=n;i++)
		{
		       for(j=1;j<=i;j++)
		       {
			   c=a+b;
			    System.out.print("  "+a);
			      a=b;
			       b=c;
		}  System.out.println();

	}
	}
}
