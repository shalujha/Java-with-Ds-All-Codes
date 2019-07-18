import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int[] arr1 = { 1, 3, 4, 5, 7 };
		int[] arr2 = { 2, 3, 5, 6 };

		int j=0;
		ArrayList<Integer> list = new ArrayList<>();
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			for( j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					list.add(arr1[i]);
					index=j;
					break;
				}
			}
			
			j=index;
		}
		
		System.out.println(list);
	}

}
