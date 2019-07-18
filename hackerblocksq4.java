import java.util.Scanner;


public class hackerblocksq4 {

		public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int i,j;
		for(i=1;i<=N;i++)
		{
			int count=0;
			for(j=1;j<=N;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}

	}

}
