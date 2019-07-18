import java.util.Scanner;

public class nextsmallerofnextgreat {
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int t = sj.nextInt();
		int greater = 0, smaller = 0, temp = 0;
		for (int k = 0; k < t; k++) {
			int n = sj.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sj.nextInt();
			}
			for (int j = 0; j < arr.length; j++) {
				for (int l = j + 1; l < arr.length; l++) {
					if (arr[j] < arr[l]) {
						greater = arr[l];
						temp = l;
						break;
					} else {
						greater = -1;
					}
				}
				for (int m = temp; m < arr.length; m++) {
					if (arr[m] < greater) {
						smaller = arr[m];
						break;
					} else {
						smaller = -1;
					}
				}
				System.out.println(smaller);
			}
		}

	}

}
