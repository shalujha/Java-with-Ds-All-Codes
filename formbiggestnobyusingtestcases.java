import java.util.Scanner;

public class formbiggestnobyusingtestcases {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();
		for (int k = 0; k < t; k++) {
			int N = sj.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sj.nextInt();
			}
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - i - 1; j++) {
					if ((compare(arr[j], arr[j + 1])) > 0) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			for (int val : arr) {
				System.out.print(val);
			}
		}

	}

	public static int compare(int num1, int num2) {
		String nums1 = num1 + "" + num2;
		String nums2 = num2 + "" + num1;
		int numval1 = Integer.valueOf(nums1);
		int numval2 = Integer.valueOf(nums2);
		if (numval1 > numval2) {
			return -1;
		} else {
			return 1;

		}
	}

}
