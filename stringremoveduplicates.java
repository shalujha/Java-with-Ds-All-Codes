import java.util.Scanner;

public class stringremoveduplicates {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		char temp=S.charAt(0);
		int count=0;
		for(int i=0;i<S.length();i++)
		{
			if(temp==S.charAt(i))
			{
				count++;
			}
			else
			{
				System.out.print(temp);
				temp=S.charAt(i);
				count=1;
			}
		}
		System.out.print(temp);
	}
}