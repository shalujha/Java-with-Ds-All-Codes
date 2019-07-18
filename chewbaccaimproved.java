import java.util.Scanner;


public class chewbaccaimproved {

	
	public static void main(String[] args) {
		
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int[]arr=new int[18];
		int count=0;
		int i=0;
		while(n!=0)
		{
			int r=n%10;
			arr[i]=r;
			i++;
			count++;
			n/=10;
		}
		int temp=count;
		int j=0;
		while(j!=count)
		{
			if(j==0 && (arr[count-1]>=5 && arr[count-1]!=9))
			{
				arr[j]=9-arr[count-1];
			}
				
			else if(j>0 && arr[count-1]>=5  )
			{
				arr[j]=9-arr[count-1];
			}else
			{
				arr[j]=arr[count-1];
			}
			j++;
			count--;
		}
		
		for(int k=0;k<count;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

}
