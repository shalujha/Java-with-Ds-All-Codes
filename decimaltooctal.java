import java.util.Scanner;


public class decimaltooctal {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N,octal=0,r,power=1;
		N=sj.nextInt();
		while(N!=0)
		{
			r=N%8;
			octal=octal+r*power;
			N=N/8;
			power=power*10;
		}
		System.out.println(octal);
		
		}

}