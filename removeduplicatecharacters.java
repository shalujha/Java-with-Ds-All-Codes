import java.util.Scanner;


public class removeduplicatecharacters {


	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);

		String str = sj.next();
		int i = 0;
		formatting(str, i);


	}
	
	public static void formatting(String str, int i) {
		if (i == str.length()-1) {
			System.out.println(str);
			return;
		}


		if(str.charAt(i)==str.charAt(i+1))
		{
			str=str.substring(0,i+1)+str.substring(i+2);
			formatting(str,i);
		}
		else
		{
			formatting(str,i+1);
		}
}
}