import java.util.Scanner;

public class removeduplicate {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str = sj.next();
		duplicates(str, 0);

	}

	public static void duplicates(String str, int i) {
		String c;
		if (i==str.length()-1) {
			System.out.println(str);
			return;
		}
		String ros = str.substring(1);
		char ch = str.charAt(0);
		if (str.charAt(i) == str.charAt(i + 1)) {
			str=str.substring(0,i+1)+str.substring(i+2);
			duplicates(str,i);
		}
		else
		{
			duplicates(str,i+1);
			
		}
	}
}
