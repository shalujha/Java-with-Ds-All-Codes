import java.util.Scanner;


public class hackerblocksq16 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
	int	N=sj.nextInt();
		int r,power=1,decimal=0;
		while(N!=0)
		{
			r=N%10;
			decimal=decimal+r*power;
			power=power*2;
			N=N/10;
		}
		System.out.println(decimal);
		
		

	}

}
