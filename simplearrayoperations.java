import java.util.Scanner;


public class simplearrayoperations {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sj.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}	
	}

}
