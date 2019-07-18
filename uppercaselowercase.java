import java.util.Scanner;


public class uppercaselowercase {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		char ch=sj.next().charAt(0);
		if(ch>='A'&& ch<='Z' )
		{
			System.out.println(" uppercase");
		}
		else if(ch>= 'a'&& ch<='z')
		{
			System.out.println("Lowercase");
		}
		else
		{
			System.out.println("invalid");
		}
		

	}

}
