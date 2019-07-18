import java.util.Scanner;


public class btd {

	
	public static void main(String[] args) {
		int N,power=1,r,decimal=0;
		Scanner sj=new Scanner(System.in);
		N=sj.nextInt();
		while(N!=0)
		{
			r=N%10;
			decimal=decimal+power*r;
			N=N/10;
			power=power*2;
		}
		System.out.println(decimal);
		

	}

}
