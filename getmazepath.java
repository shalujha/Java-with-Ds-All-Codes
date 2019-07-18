import java.util.ArrayList;
import java.util.Scanner;

public class getmazepath {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<>();
		ar = mazepath(0, 0, 2, 2);
		System.out.println(ar);

	}

	public static ArrayList<String> mazepath(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> myres = new ArrayList<>();
		ArrayList<String> rrh = mazepath(cr, cc + 1, er, ec);
		for (String val : rrh) {
			myres.add("H" + val);
		}

		ArrayList<String> rrv = mazepath(cr + 1, cc, er, ec);
		for (String val : rrv) {
			myres.add("V" + val);
		}

		ArrayList<String> rrd = mazepath(cr + 1, cc+1, er, ec);
		for (String val : rrd) {
			myres.add("D" + val);
		}

		return myres;
	}
}
