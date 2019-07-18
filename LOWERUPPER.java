import java.util.Scanner;


public class LOWERUPPER {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		char ch;
		ch=sj.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("UPPERCASE");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("lowercase");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		

	}

}
