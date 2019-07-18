import java.util.Arrays;
import java.util.Scanner;


public class soe {
	public static void main(String[] args) {

		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		soe(n);

	}
	
	public static void soe(int n)
	{
		boolean[] prime= new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		for(int table=2;table*table<=n;table++)
		{
			if(prime[table]==false)
			{
				continue;
			}
			for(int multiplier=2;multiplier*table<=n;multiplier++)
			{
				prime[table*multiplier]=false;
			}
		}
		for(int i=0;i<prime.length;i++)
		{
			if (prime[i]==true)
			{
				System.out.println(i);
			}
		}
		
	}

}
