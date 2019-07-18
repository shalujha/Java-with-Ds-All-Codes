import java.util.Scanner;


public class stringpallindrome {

		public static void main(String[] args) {
			Scanner sj=new Scanner(System.in);
			String S=sj.next();
			boolean c=pallindrome(S);
			if(c==true)
			{
				System.out.println(" true");
			}
			else
			{
				System.out.println("false");
			}
			
			

	}
		public static boolean pallindrome(String S)
		{
			String gg=S;
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

}		
		
		
		
		
		
					
		


