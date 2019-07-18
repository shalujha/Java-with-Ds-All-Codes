import java.util.Scanner;

public class splitarray {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}

		
		int c = split(arr, 0, 0, "", 0, "",0);
		System.out.println(c);
		splitarray(arr, 0, 0, "", 0, "");
	}

	public static void splitarray(int[] arr, int vidx, int sumL, String ansL,
			int sumR, String ansR) {
		if (vidx == arr.length) {
			if (sumL == sumR) {
				System.out.println(ansL + "and" + " "+ ansR);
			}
			return;
		}

		splitarray(arr, vidx + 1, sumL + arr[vidx], ansL + arr[vidx] + " ",
				sumR, ansR);
		splitarray(arr, vidx + 1, sumL, ansL, sumR + arr[vidx], ansR
				+ arr[vidx] + " ");

	}

	public static int split(int[] arr, int vidx, int sumL, String ansL,
			int sumR, String ansR,int c) {
		if (vidx == arr.length) {
			if (sumL == sumR) {
				c++;
			}
			return c;
		}
		int count = 0;
		count += split(arr, vidx + 1, sumL + arr[vidx], ansL + arr[vidx] + " ",
				sumR, ansR,c);
		count+= split(arr, vidx + 1, sumL, ansL, sumR + arr[vidx], ansR
				+ arr[vidx] + " ",c);

		return count;
	}

}
