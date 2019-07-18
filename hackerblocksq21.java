import java.util.Scanner;


public class hackerblocksq21 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N1=sj.nextInt();
		int N2=sj.nextInt();
		int n=1,s;
			while(N1!=0)
			{
				
				s=3*n+2;
				if(s%N2!=0)
				{
					System.out.println(s);
					N1--;	
						
				}
				n++;
				
				
				
				
				
				
			}
		

	}

}
