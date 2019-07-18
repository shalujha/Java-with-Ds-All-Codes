import java.util.ArrayList;
import java.util.Scanner;

public class getpermutation {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		ArrayList<String> ar = new ArrayList<>();
		ar = getpermutation(S);
		System.out.println(ar);
		ArrayList<String>br=new ArrayList<>();
		br.add("");
		System.out.println(br.size());

	}

	public static ArrayList<String> getpermutation(String S) {
		if (S.length() == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}

		char ch = S.charAt(0);
		String ros = S.substring(1);
		ArrayList<String> recres = getpermutation(ros);
		ArrayList<String> myres = new ArrayList<>();
		for (String val : recres) {
			for (int i = 0; i < val.length()+1; i++) {
				String ans = val.substring(0, i) + ch + val.substring(i);
				myres.add(ans);
			}
		}
		return myres;
	}

}
