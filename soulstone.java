import java.util.Scanner;


public class soulstone {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		String S=sj.next();
		int count=0;
		String ans="";
		String temp="";
		for(int i=0;i<S.length()-1;i++)
		{
			char ch=S.charAt(i);
			for(int j=i+1;j<=S.length();j++)
			{
				ans=S.substring(i,j);
				if(temp.equals(ans))
				{
					count++;
				}
			}
			 temp=ans;
		}
		System.out.println(count);
	}

}
