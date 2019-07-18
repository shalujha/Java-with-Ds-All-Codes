import java.util.ArrayList;
import java.util.Scanner;

public class subsetsinastring {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		ArrayList<String> ar = new ArrayList<>();
		ar = subset(S);
		System.out.println(ar);

	}

	public static ArrayList<String> subset(String S) {
		if (S.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = S.charAt(0);
		String ros = S.substring(1);
		ArrayList<String> recRes = subset(ros);
		ArrayList<String> myres = new ArrayList<>();
		for (String val : recRes) {
			myres.add(val);
			myres.add(ch + val);
			myres.add((int) ch + val);
		}
		return myres;

	}
}
