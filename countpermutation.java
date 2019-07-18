import java.util.ArrayList;
import java.util.Scanner;

public class countpermutation {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		ArrayList<String> list = new ArrayList<>();
		list = countpermutation(str, "");
		System.out.println(list);

	}

	public static ArrayList<String> countpermutation(String str, String ans) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(2);
			ArrayList<String> myresult = new ArrayList<>();
			ArrayList rr = countpermutation(ros, ans + ch);
		}
		
	}

}
