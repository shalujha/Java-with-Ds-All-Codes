import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		String ans = duplicates(str);
		System.out.println(ans);

	}

	public static String duplicates(String str) {
		char ch = str.charAt(0);
		String roq = str.substring(1);
		
		if (str.length() == 0) {
			return "";
		}
		
		String ans = duplicates(roq);
		String d=ch+ans;
		return d;
	}

}
