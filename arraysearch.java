import java.util.Scanner;


public class arraysearch {

		public static void main(String[] args) {
			Scanner sj = new Scanner(System.in);
			int n=sj.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sj.nextInt();
			}
			int item=sj.nextInt();
			for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]==item)
				{
					System.out.println("item is at "+ i+ " position");
					break;
				}
			}
		

	}

}
