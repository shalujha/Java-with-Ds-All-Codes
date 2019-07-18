import java.util.ArrayList;
import java.util.Scanner;

public class subarray {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		for (int j = 0; j < arr.length; j++) {
			list.add(arr[j]);
			count++;
		//	System.out.println(list);
			for (int k = j+1; k <arr.length; k++) {
				list.add(arr[k]);
				for(int m=0;m<list.size();m++)
				{
					
				}
				count++;
				// list.add(arr[k]);

			}
		//	System.out.println(list);
		//	count++;
						for (int l = 0; l < list.size(); l++) {
				while (list.size() != 0) {
					list.remove(l);
				}
			}

						
		}
		System.out.println(count);
	}
}