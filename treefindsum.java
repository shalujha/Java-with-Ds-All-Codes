import java.util.Scanner;


public class treefindsum {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int sum=0;
		for(int i=0;i<N;i++)
		{
			int a=sj.nextInt();
			sum+=a;
		}
		System.out.println(sum);

	}

}
