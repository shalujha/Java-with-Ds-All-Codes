import java.util.Scanner;

public class sumofdigitsinastring {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		int i = 0;
		int n = sum(str, i);
		System.out.println(n);

	}

	public static int sum(String str, int i) {
		if (str.charAt(i) == str.charAt(str.length())) {
			return 0;
		}
			int d=0;
		 d =d+ sum(str, i + 1);
		
		return d;
	}

}
