import java.util.Scanner;


public class hackerblocksq27 {

	
	public static void main(String[] args) {
		
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int i=1,r;
		for(i=1;i<=N;i++)
		{
			int power=1,decimal=0;
			int j=sj.nextInt();
			while(j!=0)
			{
				r=j%10;
				decimal=decimal+r*power;
				power=power*2;
				j=j/10;
			}
			System.out.println(decimal);
		}
		

	}

}
