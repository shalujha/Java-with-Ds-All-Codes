import java.util.Scanner;


public class octaltobinary {

	
	public static void main(String[] args) {
		Scanner gg=new Scanner(System.in);
		int N,decimal=0,r,a=1,b=1,binary=0;
		N=gg.nextInt();
		
		while(N!=0)
		{
			r=N%10;
			decimal=decimal+r*a;
			N=N/10;
			a=a*8;
		}
		
		
		
		while(decimal!=0)
		{
			r=decimal%2;
			binary=binary+r*b;
			decimal=decimal/2;
			b=b*10;
		}
		System.out.println(binary);
		}
	}



