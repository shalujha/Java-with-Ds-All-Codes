import java.util.ArrayList;
import java.util.Scanner;

public class permutation {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		ArrayList<String> ar = new ArrayList<>();
		ar = permutation(S);
		System.out.println(ar);

	}

	public static ArrayList<String> permutation(String S) {
		if (S.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		char ch = S.charAt(0);
		String ros = S.substring(1);
		ArrayList<String> recRes = permutation(ros);
		ArrayList<String> myres = new ArrayList<>();
		for (String val : recRes) {
			for (int i = 0; i <= val.length(); i++) {
				String ans = val.substring(0, i) + ch + val.substring(i);
				myres.add(ans);
			}
		}
		return myres;

	}

}
