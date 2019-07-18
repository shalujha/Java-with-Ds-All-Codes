import java.util.Scanner;


public class functionwithparams {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		System.out.println(" hello");
	int	a=sj.nextInt();
	int	b=sj.nextInt();
	addition(a,b);
	System.out.println("bye");
	}

public static void addition(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	
}
}