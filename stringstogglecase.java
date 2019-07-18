import java.util.Scanner;


public class stringstogglecase {

		public static void main(String[] args) {
			Scanner sj=new Scanner(System.in);
			String S=sj.next();
			int n=S.length();
			for(int i=0;i<n;i++)
			{
				int ch=S.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					
					 ch+=32;
					System.out.print((char)ch);
					
				}
				
				else if(ch>='a' && ch<='z')
				{
					
					ch-=32;
					System.out.print((char)ch);
					
				}
				
			}
			
	}

}
