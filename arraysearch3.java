import java.util.Scanner;

public class arraysearch3 {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		int item = sj.nextInt();
		int lo = 0;
		int hi = arr.length - 1;

		while (lo<=hi) {
			int mid = lo + hi / 2;
			if (arr[mid] == item) {
				System.out.println("item is at " + mid + " position");
				break;
			}
			else
			{
				lo++;
				hi--;
			}
		}

	}

}
