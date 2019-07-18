import java.util.Scanner;


public class maxfreq {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		String S=sj.next();
		int counter=0;
		int i;
		char ch;
		for(char j='A';j<='z';j++)
		{
			 counter=0;
			 for( i=0;i<S.length();i++)			
			{
				 ch=S.charAt(i);
				if(j==ch)
				{
					counter++;
				}
			}
		
			if(counter>0)
			{
			System.out.println(S.charAt(i) +"\t" + counter);
			}
		
		}
	}

}
