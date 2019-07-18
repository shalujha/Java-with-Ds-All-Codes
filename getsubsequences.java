import java.util.ArrayList;
import java.util.Scanner;

public class getsubsequences {
	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<>();
		String S = sj.next();
		ar = subsequences(S);
		System.out.println(ar);

	}

	public static ArrayList<String> subsequences(String S) {
		if (S.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}

		char ch = S.charAt(0);
		String ros = S.substring(1);
		ArrayList<String> myres = new ArrayList<>();
		ArrayList<String> recres = subsequences(ros);
		for (int i = 0; i < recres.size(); i++) {
			myres.add(recres.get(i));
			myres.add(ch + recres.get(i));

		}
		return myres;

	}

}
