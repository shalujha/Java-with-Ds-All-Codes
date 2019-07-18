import java.util.Scanner;

public class moveallxs {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		moveallx(str, 0);
	}
	public static void moveallx(String str, int i) {
		if (i == str.length() - 1) {
			System.out.println(str);
			return;
		}
		if (str.charAt(i) == 'x') {
			str = str.substring(0, i) + str.substring(i + 1) + 'x';
			moveallx(str, i+1 );
		} else {
			moveallx(str, i + 1);
		}
	}

}
