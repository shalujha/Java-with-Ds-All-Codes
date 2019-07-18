import java.util.ArrayList;
import java.util.Scanner;

public class keypad {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		char ch = sj.next().charAt(0);
		String str = getCode(ch);
		ArrayList<String> ar = new ArrayList<>();
		ar = subsetskeypad(str);
		System.out.println(ar);

	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> subsetskeypad(String str) {
		if (str.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recRes = subsetskeypad(ros);
		ArrayList<String> myres = new ArrayList<>();
		for (String val : recRes) {
			myres.add(val);
			myres.add(ch + val);
			myres.add((int) ch + val);
		}
		return myres;

	}

}
