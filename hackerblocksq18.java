import java.util.Scanner;


public class hackerblocksq18 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int decimal=0,r,s,a=1,binary=0,b=1;
		while(N!=0)
		{
			r=N%10;
			decimal=decimal+a*r;
			
			N=N/10;
			a=a*8;
		}
		
		while(decimal!=0)
		{
			s=decimal%2;
			binary=binary+s*b;
			
			decimal=decimal/2;
			b=b*10;
		}
		System.out.println(binary);

	}

}
