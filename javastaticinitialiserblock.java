import java.util.Scanner;

public class javastaticinitialiserblock {

	private static int B;
	private static int H;
	private static boolean flag;
	static {
		Scanner sj = new Scanner(System.in);
		B = sj.nextInt();
		H = sj.nextInt();
		sj.close();
		if (B <= 0 || H <= 0) {
			System.out
					.println("java.lang.Exception: Breadth and height must be positive ");
			flag = false;
		} else {
			flag = true;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}
