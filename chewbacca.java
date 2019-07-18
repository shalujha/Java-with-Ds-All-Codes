import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		long[] arr = new long[18];
		long x = sj.nextInt();
		long temp = x;
		int count = 0;
		long r;
		while (x != 0) {
			r = x % 10;
			arr[count] = r;
			x = x / 10;
			count++;

		}

		for (int i = 0; i < count; i++) {
			if (i != count - 1) {
				if (arr[i] >= 5) {
					arr[i] = 9 - arr[i];
				}
			}
				else {
					if (arr[i] >= 5 && arr[i] <= 8) {
						arr[i] = 9 - arr[i];
					}
				}

			}
		
		for (int k = count - 1; k >= 0; k--) {
			System.out.println(arr[k]);

		}
	}

}
