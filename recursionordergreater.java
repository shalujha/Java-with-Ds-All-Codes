import java.util.Scanner;

public class recursionordergreater {
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		dictionary(str, "", str);
	}

	public static void dictionary(String str, String ans, String orignal) {
		
		if (str.length() == 0) {
			if (ans.compareTo(orignal) < 0) {
				System.out.println(ans + " ");
				return;
			} else
			{
				return;
			}
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			ros = str.substring(0, i) + str.substring(i + 1);
			dictionary(ros, ans + ch, orignal);
		}
	}

}
