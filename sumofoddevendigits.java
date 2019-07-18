import java.util.Scanner;


public class sumofoddevendigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=0,b=0,r,s,no;
		Scanner gg=new Scanner(System.in);
		System.out.println("enter any no");
		no=gg.nextInt();
		while(no!=0)
		{
			r=no%10;
			a=a+r;
			no=no/10;
			s=no%10;
			b=b+s;
			no=no/10;
		}
		System.out.println("sum of odd digits="+a);
		System.out.println("sum of even digits="+b);
		

	}

}
