import java.util.Scanner;


public class test1 {

	
	public static void main(String[] args) {
		
		Scanner sj=new Scanner(System.in);
		int T=sj.nextInt();
		int counter;
		for(int k=1;k<=T;k++)
		{
			int n=sj.nextInt();
			int[]arr=new int[n];
			
			counter=0;
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sj.nextInt();
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j] && i<j)
				{
					counter++;
					
				}
				
			}
			
			System.out.println(counter);
			}
			
		}
					
	}

}
