import java.util.Scanner;

public class spiralpattern {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 },
				{ 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		int top = 0;
		int left = 0;
		int direction = 1;
		int right = arr[top].length - 1;
		int bottom = arr.length - 1;
		int count = (right+1) * (bottom+1);

		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (direction == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
						count--;
					}
					top++;
					direction = 2;
				}
				
			}

			if (count > 0) {
				if (direction == 2) {
					for (int i =top; i <=bottom; i++) {
						System.out.print(arr[i][right] + " ");
						count--;
					}
					right--;
					direction = 3;
				}
			}

			if (count > 0) {
				if (direction == 3) {
					for (int i = right; i >=left; i--) {
						System.out.print(arr[bottom][i] + " ");
						count--;
					}

					direction = 4;
					bottom--;

				}
			}

			if (count > 0) {
				if (direction == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + " ");
						count--;
					}
					direction = 1;
					left++;

				}
			}
		}

	}

}
