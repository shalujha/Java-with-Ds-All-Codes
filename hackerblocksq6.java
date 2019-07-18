import java.util.Scanner;


public class hackerblocksq6 {

		public static void main(String[] args) {
			Scanner sj=new Scanner(System.in);
			int N=sj.nextInt();
			int sum=0,s=0,a,b;
			while(N!=0)
			{
				a=N%10;
				sum=sum+a;
				N=N/10;
				b=N%10;
				s=s+b;
				N=N/10;
				
				
			}
			System.out.println(sum);
			System.out.println(s);
			

	}

}
