import java.util.ArrayList;
import java.util.Scanner;

public class javarrayList {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();

		ArrayList[] arr = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			int d = sj.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < d; j++) {
				int val = sj.nextInt();
				list.add(val);
			}
			arr[i] = list;
		}
		int q = sj.nextInt();
		for (int k = 0; k < q; k++) {
			int x = sj.nextInt();
			int y = sj.nextInt();
			for (int i = 0; i < n; i++) {
				if (i == x) {
					for (int j = 0; j < arr[i].size(); j++) {
						if (j == y && arr[i].get(j) != null) {
							System.out.println(arr[i].get(j));
						}
					}
				} else {
					System.out.println("ERROR");
				}

			}

		}
	}
}
