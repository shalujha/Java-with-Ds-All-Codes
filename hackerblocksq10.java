import java.util.Scanner;


public class hackerblocksq10 {

	
	public static void main(String[] args) {
	
		
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int n=sj.nextInt();
		int r,count=0;
		while(N !=0)
		{
			r=N%10;
			if(r==n)
			{
				count++;
			}
			N=N/10;
		}
		System.out.println(count);
		

	}

}
