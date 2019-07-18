import java.util.ArrayList;
import java.util.Scanner;

public class cointoss {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		System.out.println("enter the no of toss");
		int n = sj.nextInt();

		ArrayList<String> ar = new ArrayList<>();

		ar = cointoss(n);
		System.out.println(ar);

	}

	public static ArrayList<String> cointoss(int n) {
		if (n == 0) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("");
			return bres;
		}
		ArrayList<String> recRes = cointoss(n - 1);
		ArrayList<String> myres = new ArrayList<>();

		for (String val : recRes) {
			myres.add("H" + val);
			myres.add("T" + val);

		}

		return myres;

	}

}
