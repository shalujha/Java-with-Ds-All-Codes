import java.util.Scanner;


public class selectionsorts {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		
		for(int counter=0;counter<arr.length-1;counter++)
		{
			int min=counter=0;
			for(int j=counter+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			
			int temp=arr[counter];
			arr[counter]=arr[min];
			arr[min]=arr[counter];
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

}
