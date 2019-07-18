import java.util.Scanner;


public class kejriwal {

	
	public static void main(String[] args) {
		int i=1,N,sum=0,r,s=0;
		Scanner sj=new Scanner(System.in);
		N=sj.nextInt();
		while(i<=N)
		{
			int j=sj.nextInt();
		
			while(j!=0)
			{
				r=j%10;
				if(r%2!=0)
				{
				sum=sum+r;
				}
				else
				{
				s=s+r;
				}
				j=j/10;
			}
				
			if(s%4==0 || sum%3==0 )
			{
			
				System.out.println("yes");
			}
			
			
			else
			{
			
				System.out.println(" no");
			}
			j++;
			i++;
			
		}
			
			
		}
	}

			
		