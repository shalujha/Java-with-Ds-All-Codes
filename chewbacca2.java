import java.util.Scanner;

public class chewbacca2 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		long[] arr = new long[18];
		long n = sj.nextLong();
		 int count = 0; 
		while(n!=0)
		{
			long r=n%10;
			arr[count]=r;
			count++;
			n/=10;
		}
	//	System.out.println(count);
		for(int i=0;i<count;i++)
		{
			if(i!=count-1)
			{
				if(arr[i]>=5)
				{
					arr[i]=9-arr[i];
				}
			}else
			{
				if(arr[i]>=5 &&  arr[i]!=9)
				{
					arr[i]=9-arr[i];
				}
			}
		}
		for(int i=count-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}
