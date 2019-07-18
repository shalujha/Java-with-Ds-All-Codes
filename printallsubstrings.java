import java.util.Scanner;


public class printallsubstrings {

	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		String S=sj.next();
		for(int i=0;i<S.length();i++)
		{
			for(int j=i+1;j<=S.length();j++)
			{
				System.out.println(S.substring(i,j));
			}
		}
		

	}

}
