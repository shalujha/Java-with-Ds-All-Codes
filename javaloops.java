import java.util.Scanner;


public class javaloops {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int res=0;
		for(int i=1;i<=10;i++)
		{
			res=N*i;
			System.out.println(N+" x "+i+" ="+" "+res);
		}
	}

}
