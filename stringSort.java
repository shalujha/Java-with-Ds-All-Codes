import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class stringSort {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sj.next());
		}

		for (int i = 0; i < n - 1; i++) {
			if (list.get(i).compareTo(list.get(i + 1)) > 0) {
				Collections.swap(list, i, i + 1);
			}
		}

		for (int i = 0; i < n-1; i++) {
			if(list.get(i).length()<list.get(i+1).length())
			{
				Collections.swap(list, i, i+1);
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(list.get(i));
		}
	}

}
