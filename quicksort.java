import java.util.Scanner;


public class quicksort {

		public static void main(String[] args) {
	
			Scanner sj=new Scanner(System.in);
			int N=sj.nextInt();
			int[]arr=new int[N];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sj.nextInt();
			}
			
			quicksort(arr,0,arr.length-1);
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
	}
		
		public static void quicksort(int[]arr,int lo,int hi)
		{
			if( lo>hi)
			{
				return;
			}
			
			int left=lo;
		int	right=hi;
		int	mid=(lo+hi)/2;
		int pivot=arr[mid];
		while(left<=right)
		{
			while(arr[left]<pivot)
			{
				left++;
			}
			while(arr[right]>pivot)
			{
				right--;
			}
			if(left<=right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
		}
		quicksort(arr, lo, right);
		quicksort(arr,left,hi);
		}

}
