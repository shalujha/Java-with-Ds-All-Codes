import java.util.Scanner;


public class hackerblocksq25 {

	static Scanner gg=new Scanner(System.in);
	public static void main(String[] args) {
		int c;
		int[]arr=takeInput();
		c=binarysearch(arr);
		System.out.println(c);
	}
	
	public static int[]takeInput()
	{
		int n;
		n=gg.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=gg.nextInt();
		}
		return arr;
		
	}
	public static int binarysearch(int[]arr)
	{
		int low=0;
		int high=arr.length-1;
		int  mid=(low+high)/2;
		int M=gg.nextInt();
		if(M>arr[mid])
		{
			low=mid+1;
		}
		if(M<arr[mid])
		{
			high=mid-1;
		}
		if(M==arr[mid])
		{
			return mid;
			
		}
		
	
	return -1;
	}
}
