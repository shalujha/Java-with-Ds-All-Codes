import java.util.Scanner;


public class formbiggestno {

	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int t=sj.nextInt();
		int counter;
		for(int k=0;k<t;k++)
		{
			 counter=0;
			int N=sj.nextInt();
			long[]A=new long[N];
			
		
		for(int i=0;i<A.length;i++)
		{
			A[i]=sj.nextLong();	
		}
		for(int i=0;i<A.length-1;i++)
		{
		
		for(int j=0;j<A.length-i-1;j++)
		{
			if(A[i]>A[j] && i<j)
			{
				counter++;
			}
		}
			
		}
		
		System.out.println(counter);
		}
		

	}

}
