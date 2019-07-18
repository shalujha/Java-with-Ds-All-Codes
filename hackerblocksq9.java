import java.util.Scanner;


public class hackerblocksq9 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int T=sj.nextInt();
		int M,N,j;
		for(int i=1;i<=T;i++)
		{
			int se=0,so=0, flag=0;
			 M=sj.nextInt();
			N=sj.nextInt();
			for( j=1;M>0 && N>0;j++)
			{
				if(j%2==0)
				{
					se=se+j;
					if(se>N)
					{
						flag=0;
						break;
					}
				}
				if(j%2!=0)
				{
					so=so+j;
					if(j>M)
					{
						flag=1;
						break;
					}
				}
			}
			
		if(flag==0)
		{
			System.out.println("Aayush");
		}
		if(flag==1)
		{
			System.out.println("Harshit");
		}
		
			}

	}

}
