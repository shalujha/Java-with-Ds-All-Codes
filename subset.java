import java.util.Scanner;
public class subset {
	
	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sj.nextInt();
		}
		int target = sj.nextInt();
		int vidx = 0;
		int sum = 0;
		int c = subset(arr, vidx, sum, "", target);
		System.out.println(c);
		subsetsyso(arr, vidx, sum, "", target);
	}
	public static int subset(int[] arr, int vidx, int sum, String ans,
			int target) {
		if (vidx == arr.length) {
			if (sum == target) {
				return 1;
			} else {
				return 0;
			}
		}
		int count = 0;
		count += subset(arr, vidx + 1, sum + arr[vidx], ans + arr[vidx] + " ",
				target);
		count += subset(arr, vidx + 1, sum, ans, target);
		return count;
	}
	public static void subsetsyso(int[] arr, int vidx, int sum, String ans,
			int target) {
		if (vidx == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				return;
			}else
			{
				return;
			}
		}
		subsetsyso(arr, vidx + 1, sum + arr[vidx], ans + arr[vidx] +  " ", target);
		subsetsyso(arr, vidx + 1, sum, ans, target);
	}
}
