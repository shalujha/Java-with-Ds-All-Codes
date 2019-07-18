import java.util.Scanner;


public class spiral {

	
	public static void main(String[] args) {
	
		/*int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 },
				{ 31, 32, 33, 34 }, { 41, 42, 43, 44 } };*/
		
		Scanner sj=new Scanner(System.in);
		int m=sj.nextInt();
		int n=sj.nextInt();
		int[][]arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sj.nextInt();
			}
		}
		int top=0;
		int left=0;
		int bottom=arr[top].length-1;
		int right=arr.length-1;
		int count=(bottom+1)*(right+1);
		int direction=1;
		
		while(left<=right && top<=bottom)
		{
			if(count>0)
			{
				if(direction==1)
				{
					for(int i=left;i<=right;i++)
					{
						System.out.print(arr[top][i]+", ");
						count--;
					}
				}
				top++;
				direction=2;
			
			}
			
			if(count>0)
			{
				if(direction==2)
				{
					for(int i=top;i<=bottom;i++)
					{
					System.out.print(arr[i][right]+", ");
					count--;
					}
				}
				right--;
				direction=3;
				
			}
			
			if(count>0)
			{
				if(direction==3)
				{
					for(int i=right;i>=left;i--)
					{
						System.out.print(arr[bottom][i]+", ");
						count--;
					}
				}
				bottom--;
				direction=4;
				
			}
			if(count>0)
			{
				if(direction==4)
				{
					for(int i=bottom;i>=top;i--)
					{
						System.out.print(arr[i][left]+", ");
						count--;
					}
				}
				left++;
				direction=1;		
			}
		}
		System.out.print("END");
	}

}
