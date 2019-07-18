import java.util.Scanner;


public class oddevencharacter {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		String S=sj.next();
		oddeven(S);
		
	}
	public static void oddeven(String S)
	{
		String gg=S;
		for(int i=0;i<gg.length();i++)
		{
			int ch=gg.charAt(i);
			if(ch%2!=0)
			{
				ch++;
				System.out.print((char)ch);
			}
			else
			{
				ch--;
				System.out.print((char)ch);
			}
		}
		

	}

}
