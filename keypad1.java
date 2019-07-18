import java.util.Scanner;


public class keypad1 {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		String str=sj.next();
		System.out.println(keypad(str,""));
		keypad1(str,"");
	}
	
	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}
	public static int keypad(String ques,String ans)
	{
		if(ques.length()==0)
		{
			
			return  1;
		}
		int count=0;
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		String code=getCode(ch);
		for(int i=0;i<code.length();i++)
		{
			count+=keypad(roq,ans+code.charAt(i));
		}
		return count;
	}


	
	public static void keypad1(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.print(ans +" ");
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		String code=getCode(ch);
		for(int i=0;i<code.length();i++)
		{
			keypad1(roq,ans+code.charAt(i));
		}
		
	}
}
