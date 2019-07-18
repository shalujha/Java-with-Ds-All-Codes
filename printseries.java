import java.util.Scanner;


public class printseries {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N1,N2,counter=1,d,e;
		N1=sj.nextInt();
		N2=sj.nextInt();
		int n=1;
		while(counter<=N1)
		{
		
			d=3*n+2;
			
			if(d%N2!=0)
			{
				counter++;
			
			System.out.println(d);
			}
			n++;
			
		}
		
		
	}

}
