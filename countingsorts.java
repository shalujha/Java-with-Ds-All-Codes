import java.util.Scanner;

public class countingsorts {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n=sj.nextInt();
		int[] arr = new int[n] ;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sj.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] brr = new int[max + 1];
		for (int j = 0; j < brr.length; j++) {
			int count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (j == arr[k]) {
					count++;
				}
			}

			brr[j] = count;
		}

		int[] crr = new int[arr.length];
		int j = 0;
		for (int i = 0; i < brr.length; i++) {
			int val = brr[i];
			while (j != crr.length) {
				int k = 0;
				while (k < val) {
					crr[j] = i;
					j++;
					k++;
				}
				break;
			}
		}

		for (int i = 0; i < crr.length; i++) {
			System.out.println(crr[i]);
		}

	}

}
