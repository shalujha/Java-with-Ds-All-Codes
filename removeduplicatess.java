import java.util.Scanner;

public class removeduplicatess {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		duplicate(str, 0);

	}

	public static void duplicate(String str, int i) {
		if (i == str.length() - 1) {
			System.out.println(str);
			return;
		}

		if (str.charAt(i) == str.charAt(i + 1)) {
			
			str = str.substring(0, i) + str.substring(i + 1);
			duplicate(str, i);
		} else {
			duplicate(str, i + 1);
		}

	}

}
