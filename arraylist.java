import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
	static Scanner sj = new Scanner(System.in);

	public static void main(String[] args) {

		int[] one = takeInput();
		int[] two = takeInput();
		ArrayList<Integer> list = intersection(one, two);
		System.out.println(list);
	}

	public static int[] takeInput() {

		System.out.println("enter size of array");
		int n = sj.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter ist array ");
			arr[i] = sj.nextInt();
		}
		return arr;
	}

	public static ArrayList<Integer> intersection(int[] arr, int[] brr) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < brr.length; j++)
				if (arr[i] == brr[j]) {
					list.add(arr[i]);
					brr[j] = Integer.MAX_VALUE;
					break;
				}

		}
		return list;

	}

}
