import java.util.Scanner;


public class printtargetsumtriplets {

	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int[]arr=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sj.nextInt();
		}
		int m=sj.nextInt();
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;i++)
			{
				for(int k=j+1;i<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==m)
					{
						System.out.println(arr[i] +","+ arr[j] +"and"+arr[k]);
					}
				}
			}
		}

	}

}
