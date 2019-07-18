import java.util.Scanner;


public class mathday {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int T=sj.nextInt();
		for(int i=0;i<T;i++)
		{
		int A=sj.nextInt();
		int N=sj.nextInt();
		int P=sj.nextInt();
		int power=(int)Math.pow(A, N);
		int result=power%P;
		System.out.println(result);
		
		
	}

}
}