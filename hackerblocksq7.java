import java.util.Scanner;


public class hackerblocksq7 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int remainder;
		int N1=sj.nextInt();
		int N2=sj.nextInt();
		while(N1%N2!=0)
		{
			remainder=N1%N2;
			N1=N2;
			N2=remainder;
			
		}
		System.out.println(N2);


	}

}
