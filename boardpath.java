import java.util.ArrayList;
import java.util.Scanner;

public class boardpath {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int start = sj.nextInt();
		int end = sj.nextInt();
		ArrayList<String> ar = new ArrayList<>();
		ar = getboardpath(start, end);
		System.out.println(ar);

	}

	public static ArrayList<String> getboardpath(int start, int end) {
		if (start == end) {
			ArrayList<String> bres = new ArrayList<>();
			bres.add("\n");
			return bres;
		}
		if (start > end) {
			ArrayList<String> bres = new ArrayList<>();
			return bres;
		}
		ArrayList<String> myres = new ArrayList<>();
		for (int dice = 1; dice <= 6 && dice+start<=end; dice++) {
			ArrayList<String> recRes = getboardpath(start + dice, end);

			for (String val : recRes) {
				myres.add(dice + val);

			}

		}
		return myres;

	}

}
