import java.util.Scanner;


public class hackerblocksq19 {

	
	public static void main(String[] args) {
			int sum=0;
			Scanner sj=new Scanner(System.in);
			
			int i=1;
			while(i<=5)
			{
				int N=sj.nextInt();
				sum=sum+N;
				if(sum>0)
				{
				System.out.println(N);
				}
				else
				{
					break;
			}
			}
	}

}
