import java.util.Scanner;


public class reversearra {
		static	Scanner sj=new Scanner(System.in);
	public static void main(String[] args) {
	
			int[]arr=takeInput();
			int[]c=reverse(arr);
			display(c);
			
			
	}
	public static int[]takeInput()
	{
			int N=sj.nextInt();
			int[]arr=new int[N];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sj.nextInt();
			}
			return arr;
	}
	
	public static int[]reverse(int[]arr)
	{
			for(int i=0;i<=arr.length/2;i++)
			{
				int temp=arr[i];
				arr[i]=arr[arr.length-i-1];
				arr[arr.length-i-1]=temp;
			}
			return arr;
	}
	
	public static void display(int[] c)
	{
			for(int i=0;i<=c.length-1;i++)
			{
			System.out.println(c[i]);
			}
			

	}

}
