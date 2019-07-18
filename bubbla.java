import java.util.Scanner;


public class bubbla {

	static Scanner sj=new Scanner(System.in);
	public static void main(String[] args) {
		int[]arr=takeInput();
		int[]c=bubblesort(arr);
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
	
	public static int[]bubblesort(int[]arr)
	{
		for(int counter=0;counter<arr.length-1;counter++)
		{
			for(int j=0;j<arr.length-counter-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
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
