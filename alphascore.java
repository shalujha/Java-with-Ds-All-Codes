import java.util.Scanner;

public class alphascore {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sj.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < N; i++) {

			for (int j = i+1; j <= N; j++) {
				if (arr[i] > arr[j]) {
					sum =sum+ arr[j];
				}

			}

		}
		System.out.println(sum);

	}

}
