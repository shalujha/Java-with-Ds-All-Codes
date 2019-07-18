import java.util.Scanner;


public class hackerblocksq3 {

		public static void main(String[] args) {
			Scanner sj=new Scanner(System.in);
			int N=sj.nextInt();
			int r,ulta=0;
			while(N!=0)
			{
				r=N%10;
				ulta=ulta*10+r;
				N=N/10;
			}
			System.out.println(ulta);

	}

}
