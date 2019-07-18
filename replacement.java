import java.util.Scanner;


public class replacement {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N,reverse=0,r,ulta=0;
		N=sj.nextInt();
		while(N!=0)
		{
			r=N%10;
			if(r==0)
			{
				r=5;
			}
			reverse=reverse*10+r;
			N=N/10;
			}
		int a;
		while(reverse!=0)
		{
			a=reverse%10;
			ulta=ulta*10+a;
			reverse=reverse/10;		
		}
		System.out.println(ulta);
		
		}
		
	}


