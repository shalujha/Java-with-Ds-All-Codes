import java.util.Scanner;


public class series {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,a=0,b=1,c;
		Scanner gg=new Scanner(System.in);
		System.out.println("enter any no");
		n=gg.nextInt();
		for(i=0;i<=n-1;i++)
		{
			
			 c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
	}

}

