import java.util.Scanner;


public class inverseofarrray {
		static	Scanner sj=new Scanner(System.in);
	public static void main(String[] args) {
		
		int[]arr=takeInput();
		int[]c=inverse(arr);
		display(c);
	

	}
	
	
	public static int[] takeInput()
	{
		int N=sj.nextInt();
		int[]arr=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sj.nextInt();
		}
		return arr;
	}
	
	public static int[]inverse(int[] arr)
	{
		int[]c=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
		int temp=arr[i];
			arr[i]=i;
			c[temp]=arr[i];
				
		}
		return c;
		
		
	}
	
	public static void display(int[] c)
	{
			for(int i=0;i<=c.length-1;i++)
			{
			System.out.println(c[i]);
			}
			

	}


}
