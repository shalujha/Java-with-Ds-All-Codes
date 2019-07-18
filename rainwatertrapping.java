import java.util.Scanner;

public class rainwatertrapping {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sj.nextInt();

		}
		int left = arr[0];
		int sum = 0;
		for (int i = 1; i < arr.length-1; i++) {
			if (left > arr[i]) {
				sum =sum+ (left - arr[i]);

			} else {
				sum += arr[i] - left;
			}
			left=arr[i+1];
		}
		

		System.out.println(sum);
	}

}
