import java.util.Scanner;

public class armstron {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int low=scn.nextInt();
		int high=scn.nextInt();
		
		printArmstrong(low,high);

	}
	
	public static void  printArmstrong(int lo, int hi) {

		for (int i = lo; i <= hi;i++) {
			boolean ans = isArmstrong(i);
			if (ans == true) {
				System.out.println(i);
			}
		}
	}

	public static boolean isArmstrong(int n) {

		int nod = numberOfDigits(n);
		int temp = n;
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			ans = ans + (int) Math.pow(rem, nod);
			n = n / 10;
		}
		if (temp == ans) {
			return true;
		} else {
			return false;
		}
	}
 
	public static int numberOfDigits(int n) {
		int count = 0;
		while (n != 0) {
			count=count+1;
			n = n / 10;
		}
		return count;
	}
}	


