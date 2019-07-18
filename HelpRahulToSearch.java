import java.util.Scanner;

public class HelpRahulToSearch {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int item = sj.nextInt();
		System.out.println(search(arr, item));

	}

	public static int search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}

		return -1;
	}

}
// 5 4 5 1 2 3 2 
