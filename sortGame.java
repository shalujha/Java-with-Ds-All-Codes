import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortGame {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		int x = sj.nextInt();
		int n = sj.nextInt();
		for (int i = 0; i < n; i++) {
			list2.add(sj.next());
			list1.add(sj.nextInt());

		}

		for (int i = 0; i < n - 1; i++) {
			if (list1.get(i) < list1.get(i + 1)) {
				Collections.swap(list1, i, i + 1);
				Collections.swap(list2, i, i + 1);
			}
		}

		int i=0;
		
		for ( i = 0; i < n - 1; i++) {
			if (list1.get(i) >= x)
				if (list1.get(i) != list1.get(i + 1)) {
					System.out.println(list2.get(i) + " " + list1.get(i));
				} else {
					if (list2.get(i).compareTo(list2.get(i + 1)) > 0) {
						
						Collections.swap(list2, i,i+1);
						System.out.println(list2.get(i) + " "
								+ list1.get(i));
					}

				}
		}
			}

}
