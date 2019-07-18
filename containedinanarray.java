import java.util.Scanner;


public class containedinanarray {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int N=sj.nextInt();
		int[]arr=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sj.nextInt();
		}
		int item=sj.nextInt();
		int i=0;
		boolean c=contained(arr,i,item);
		System.out.println(c);

	}
	
	public static boolean contained(int[]arr,int i,int item)
	{
		if(i==arr.length)
		{
			return false;
		}
		if(item==arr[i])
		{
			return true;
		}
		else
		{
			boolean d=contained(arr,i+1,item);
			return d;
		}
		
	}

}
