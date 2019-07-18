import java.util.ArrayList;
import java.util.Scanner;

public class pallindromicsubstrings {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();

		System.out.println(countpallindromes(str));

	}

	public static int countpallindromes(String str) {

		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i <str.length(); i++) {
			for (int j = i+1; j <=str.length(); j++) {
				if (checkpallindrome(str.substring(i, j))) {
					list.add(str.substring(i, j));
				}
			}
		}

		return list.size();
	}

	public static boolean checkpallindrome(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}

		}

		return true;
	}

}
