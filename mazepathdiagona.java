import java.util.ArrayList;
import java.util.Scanner;


public class mazepathdiagona {

	
	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int cr = sj.nextInt();
		int cc = sj.nextInt();
		int er = sj.nextInt();
		int ec = sj.nextInt();
		ArrayList<String> ar = new ArrayList<>();
		ar = mazepathdiagonal(cr, cc, er, ec);
		System.out.println(ar);


	}
	
	public static ArrayList<String> mazepathdiagonal(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		if (cr > er || cc > ec) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		ArrayList<String> myres = new ArrayList<>();
		ArrayList<String> recresH = mazepathdiagonal(cr + 1, cc, er, ec);

		for (String val : recresH) {
			myres.add("H" + val);

		}
		ArrayList<String> recresV = mazepathdiagonal(cr, cc + 1, er, ec);

		for (String val : recresV) {
			myres.add("V" + val);

		}
		ArrayList<String> recresd = mazepathdiagonal(cr+1, cc + 1, er, ec);

		for (String val : recresd) {
			myres.add("D" + val);

		}

		return myres;

	}


}
