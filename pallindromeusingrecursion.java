import java.util.Scanner;


public class pallindromeusingrecursion {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		String str=sj.next();
		int i=0;
		boolean c=pallindrome(str,i);
		System.out.println(c);

	}
	
	public static boolean pallindrome(String str,int i)
	{
		if(i==str.length()/2)
		{
			return true;
		}
	
	if(	str.charAt(i) != str.charAt(str.length()-i-1))
	{
		return false;
	}
	else
	{
		boolean d=pallindrome(str,i+1);
		return d;
		
	}

}
}