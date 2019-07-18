import java.util.Scanner;


public class stringsdifferenceinasccicodes {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		String S=sj.next();
		for(int i=1;i<S.length();i++)
		{
			int ch=S.charAt(i);
		
			int a=S.charAt(i)-S.charAt(i-1);
			if(i==1)
			{
				System.out.print(S.charAt(i-1));
			}
			System.out.print(a);
			System.out.print(S.charAt(i));
			
		}

	}

}
