import java.util.Scanner;


public class binarytodecimal {

	
	public static void main(String[] args) {
		int power=1;
		int decimal=0;
		int n,r;
		Scanner gg=new Scanner(System.in);
		n=gg.nextInt();
		while(n!=0)
		{
			r=n%10;
			decimal=decimal+power*r;
			n=n/10;
			power=power*2;
			
		}
		
		System.out.println(decimal);
	}

}
