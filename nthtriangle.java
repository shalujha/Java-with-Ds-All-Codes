import java.util.Scanner;


public class nthtriangle {

	
	public static void main(String[] args) {
	Scanner sj=new Scanner(System.in);
	int N=sj.nextInt();
	int c=triangle(N);
	System.out.println(c);

	}

	
	public static int triangle(int N)
	{
		
		if(N==0)
		{
			return 0;
		}
		
		
		int d=triangle(N-1);
		int ans=N+d;
		return ans;
	}
}
