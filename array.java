import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int i;
		System.out.println("size ?");
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		System.out.println("--------------");
		for (i = 0; i < n; i++) {

			System.out.println(arr[i]);
		}
		System.out.println("--------------");

	}

}
