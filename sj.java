import java.util.Scanner;


public class sj {

	
	public static void main(String[] args) {
	
		
	int[]arr=takeinput();
	display(arr);
	
	
	}
	public static int[] takeinput()
	{
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sj.nextInt();
		}
		return arr;
			
		}
		
		public static void display(int [] arr)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
		

}        
		       
	

