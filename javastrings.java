import java.util.Scanner;

public class javastrings {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		String str1 = sj.next();
		String str2 = sj.next();
		System.out.println(str1.length() + str2.length());
		if (str1.compareTo(str2) > 0) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		char ch1=str1.charAt(0);
		char ch2=str2.charAt(0);
		int a=(int)ch1 -32;
		int b=(int)ch2 -32;
		ch1=(char)a;
		ch2=(char)b;
	System.out.print(ch1+""+str1.substring(1));
	System.out.print(" ");
	System.out.print(ch2+""+str2.substring(1));

	}

}
