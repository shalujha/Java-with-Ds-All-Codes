import java.util.Scanner;

public class move {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		int i = 0;
		move(str, i);

	}

	public static void move(String str, int i) {
		if (i == str.length() - 1) {
			System.out.println(str);
			return;
		}
		if (str.charAt(i) == 'x') {
			str = str.substring(0,i)+str.substring(i + 1) + 'x';
			move(str, i+1);
		} else {
			move(str, i + 1);
		}
	}
}
