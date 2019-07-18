import java.util.Scanner;


public class hackerblocksq20 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int a=N;
		int r,reverse=0,ulta=0;
		while(N!=0)
		{
			r=N%10;
			if(r==0)
			{
				r=5;
			}
			ulta=ulta*10+r;
			N=N/10;
			
		}
		while(ulta!=0)
		{
			r=ulta%10;
			reverse=reverse*10+r;
			ulta=ulta/10;
		}
		System.out.println(reverse);
	}

}
