import java.util.ArrayList;
import java.util.Scanner;

public class justlarger {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<>();
		list.add("D");
		list.add("J");
		list.add("K");
		String target = sj.next();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(target) > 0) {
				System.out.println(list.get(i));
				break;
			}
		}

	}

}
