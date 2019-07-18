import java.util.Scanner;


public class ayush {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j,n,count=0;
		Scanner gg=new Scanner(System.in);
		System.out.println("enter any no");
		n=gg.nextInt();
		for(i=1;i<=n;i++)
		{
			count=0;
			for(j=1;j<=i;j++)
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
