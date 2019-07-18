import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		int[] arr = takeInput();
		int[] ans= inverse(arr);
		display(ans);

	}

	public static int[] takeInput() {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;

	}

	public static int[] inverse(int[] arr) {
		int[] ans = new int[arr.length];
		
	
		for (int i = 0; i < arr.length; i++) {
		 int t = arr[i];
		 ans[t] = i;
		}
		return ans;
	}

	public static void display(int[] ans) {
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

}
