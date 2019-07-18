import java.util.Scanner;


public class permutationusinggetprint {

	
	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		print(S, " ");



	}
	
	public static void print(String ques,String ans)
	{
		if(ques.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++)
		{
			char ch=ques.charAt(i);
			String roq=ques.substring(0,i)+ques.substring(i+1);
			print(roq,ans+ch);
		}
		
	}

}
