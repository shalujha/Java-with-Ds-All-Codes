import java.util.Scanner;


public class upperandLowerBound {

	
	public static void main(String[] args) {
		
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int t=sj.nextInt();
		for(int i=0;i<t;i++)
		{
			int x=sj.nextInt();
			int flag=0;
			int flag2=0;
			for(int k=0;k<arr.length;k++)
			{
				if(arr[k]==x)
				{
					System.out.print(k+" ");
					flag2=1;
					break;
				}
			}
			if(flag2==0)
			{
				System.out.print("-1");
			}
			for(int j=arr.length-1;j>=0;j--)
			{
				if(arr[j]==x)
				{
					System.out.print(j);
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print("-1");
			}	
				System.out.println();
		}

	}

}
// 5 1 2 3 3 4 3 2 3 10