import java.util.Scanner;


public class countpallidromicstring {

	
	public static void main(String[] args) {
		Scanner  sj=new Scanner(System.in);
		String S=sj.next();
		int c=	countsubstrings(S);
		System.out.println(c);
			
		

	}
	public static boolean pallindrome(String ss)
	{
		String gg=ss;
		int n=gg.length();
		for(int i=0;i<gg.length();i++)
		{
			if(gg.charAt(i) != gg.charAt(gg.length()-i-1))
					{
				return false;
					}
		}
		return true;
	}


		public static int  countsubstrings(String S)
		{
			int count=0;
			for(int i=0;i<S.length();i++)
			{
				for(int j=i+1;j<S.length();j++)
				{
					String ss=S.substring(i,j);
					if(pallindrome(ss))
						count++;
						
					
				}
			}
			
			return count;
	
}

}
