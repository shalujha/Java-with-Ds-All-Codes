import java.util.ArrayList;
import java.util.Scanner;


public class sumofarrays {
		static Scanner sj=new Scanner(System.in);
	public static void main(String[] args) {
		int[] one = takeInput();
		int[] two = takeInput();
		ArrayList<Integer> list = sum(one, two);
		System.out.println(list);
	
	
	}
	
	public static int[]takeInput()
	{
		System.out.println("enter size of array");
		int n = sj.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter ist array ");
			arr[i] = sj.nextInt();
		}
		return arr;
	}
	
	public static ArrayList<Integer> sum (int[]arr,int[]brr)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int i=arr.length-1;
		int j=brr.length-1;
		int carry=0;
	
		while(i>=0 || j>=0)
		{
			int sum=carry;
			if(i>=0)
			{
				sum+=arr[i];
			}
			if(j>=0)
			{
				sum+=brr[j];
			}
			int rem=sum%10;
			carry=sum/10;
			list.add(0,rem);
			i--;
			j--;
			
		}
		if(carry!=0)
		{
			list.add(0,carry);
		}
		return list;
	}
			

}
