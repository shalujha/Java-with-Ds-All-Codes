import java.util.Scanner;


public class hackerblocksq29 {
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
		char ch=sj.next().charAt(0);
		int c;
		if(ch=='+' )
		{
			int N1=sj.nextInt();
			int N2=sj.nextInt();
			
			c=N1+N2;
			System.out.println(c);
		}
		if(ch=='-')
		{
			int N1=sj.nextInt();
			int N2=sj.nextInt();
			
			c=N1-N2;
			System.out.println(c);

		}
		if(ch=='*')
		{
			int N1=sj.nextInt();
			int N2=sj.nextInt();
			
			c=N1*N2;
			System.out.println(c);

		}
		if(ch=='/')
		{
			int N1=sj.nextInt();
			int N2=sj.nextInt();
			
			c=N1/N2;
			System.out.println(c);

		}
		if(ch=='%')
		{
			int N1=sj.nextInt();
			int N2=sj.nextInt();
			
			c=N1%N2;
			System.out.println(c);

		}
		if(ch=='X' || ch=='x')
		{
			;
		}
		if(ch!='+'&& ch!='-'&& ch!='*'&& ch!='%'&& ch!='/'&& ch!='X'&& ch!='x')
		{
			System.out.println("Invalid operation , try again ");
			
		}
		
		}
	}

}
