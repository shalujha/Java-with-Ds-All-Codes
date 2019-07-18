import java.util.Scanner;


public class mirrorinverse {

	static	Scanner sj=new Scanner(System.in);
	public static void main(String[] args) {
		int[]arr=takeInput();
		int[]c=inverse(arr);
		boolean d=mirrorInverse(c,arr);
		System.out.println(d);
	
		

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
	
	public static int[]inverse(int[]arr)
	{
			for(int i=0;i<=arr.length/2;i++)
			{
				int temp=arr[i];
				arr[i]=arr[arr.length-i-1];
				arr[arr.length-i-1]=temp;
			}
			return arr;
	}
	
	public static boolean mirrorInverse(int[]c,int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(arr[i]!=c[j])
				{
					return false;
					
				}
			}
		}
		return true;
		
	}
	
	
	
	

}
