import java.util.Scanner;


public class hackerblocksq17 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int octal=0,r,power=1;
		while(N!=0)
		{
			r=N%8;
			octal=octal+r*power;
			power=power*10;
			N=N/8;
			
		}
		System.out.println(octal);
	}

}
