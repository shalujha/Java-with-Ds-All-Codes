import java.util.Scanner;

public class reversearrayusingrecursion {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int i = 0;
		int k = arr.length - 1;
	int[]c=	reverse(arr, i, k);
		for (i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}

	}

	public static int[] reverse(int[] arr, int i, int k) {
		
		if (i >= k/2 ) {
			return;

		}
		int temp;
		temp = i;
		i = k;
		k = temp;
		reverse(arr, i + 1, k - 1);

		return arr;
	}

}
