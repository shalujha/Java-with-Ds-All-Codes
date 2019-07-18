import java.util.Scanner;


public class printpermutation {

		public static void main(String[] args) {
	
			Scanner sj=new Scanner(System.in);
			String str=sj.next();
			permutation(str," ");

	

}
		
		public static void permutation(String ques,String ans)
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
				permutation(roq,ans+ch);
			}
		}
}

