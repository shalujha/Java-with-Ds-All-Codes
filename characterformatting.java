import java.util.Scanner;

public class characterformatting {
	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		
		String c = formatting(str);
		System.out.println(c);
	}

	public static String formatting(String str) {
		if (str.length() == 0) {
			return "";
		}
		char ch = str.charAt(0);
		String roq = str.substring(0);
		String ans = formatting(roq);
		if (ch == roq.charAt(1)) {
			return ch+ "*" + ans;
		}
		
		
		return ch+ans;
	}
}
