import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {

		int c;
		int[] arr = takeInput();
		c = linearsearch(arr);
		
			System.out.println(c);
		
		}

	

	public static int[] takeInput() {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static int linearsearch(int[] arr) {
		Scanner sj = new Scanner(System.in);
		int val;
		val = sj.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				return i;
			}

		}
		return -1;
	}

}
