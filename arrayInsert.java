import java.util.Scanner;


public class arrayInsert {

		public static void main(String[] args) {
	
			Scanner sj=new Scanner(System.in);
			int n=sj.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<n-1;i++)
			{
				arr[i]=sj.nextInt();
			}
			int k=sj.nextInt();
			int item=sj.nextInt();
			for(int i=arr.length-1;i>=k;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[k]=item;
			for(int i=0;i<arr.length;i++)
			{
			System.out.println(arr[i]);
			}
		

	}

}
