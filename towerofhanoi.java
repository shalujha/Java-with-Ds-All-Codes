import java.util.Scanner;

public class towerofhanoi {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		String T1, T2, T3;
		TOH(N,"T1","T2","T3");
		int x=(int)Math.pow(2,N);
		System.out.println(x-1);
		

	}

	public static void TOH(int N, String src, String destination, String helper) {
		if (N == 1) {
			System.out.println("Move"+" "+ "1th" +" "+"dics"+ " "+"from"+" " + src +" "+"to"+" " + destination);
			return;
		}

		TOH(N - 1, src, helper, destination);
		System.out.println("Move"+" "+ N+"th" +" "+"dics"+ " "+"from"+" " + src +" "+"to"+" " + destination);
		TOH(N - 1, helper, destination, src);

	}
}
