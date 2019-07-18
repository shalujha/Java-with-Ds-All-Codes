import java.util.Scanner;


public class countaaa {

		public static void main(String[] args) {
	
			Scanner sj=new Scanner(System.in);
			int N1=sj.nextInt();
			int N2=sj.nextInt();
			while(N2%N1!=0)
			{
				int remainder=N2%N1;
			
				N2=N1;
				N1=remainder;
			}
			System.out.println(N1);

	}

}
