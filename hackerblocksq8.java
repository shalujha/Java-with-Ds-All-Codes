import java.util.Scanner;


public class hackerblocksq8 {

		public static void main(String[] args) {
			Scanner sj=new Scanner(System.in);
			int N1=sj.nextInt();
			int N2=sj.nextInt();
			int L,i;
			for(L=2;L<=N1*N2;L++)
			{
				if(L%N1==0 && L%N2==0)
				{
					break;
				}
			}
			System.out.println(L);
			

	}

}
