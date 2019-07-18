import java.util.Scanner;


public class duplicatecharacterformatting {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		String S=sj.next();
		int i=0;
		duplicate(S,i);

	}
	
	public static void duplicate(String S,int i)
	{
		if(i==S.length())
		{
			return;
		}
		
		char ch=S.charAt(0);
		String ros=S.substring(1);
		duplicate(S,i+1);
		if(ch==ros.charAt(0))
		{
	String ans=S.replace(ch,'*');
	System.out.println(ans);	
		}
		
		
		
		
		
	}

}
