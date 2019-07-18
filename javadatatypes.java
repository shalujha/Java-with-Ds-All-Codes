import java.util.Scanner;


public class javadatatypes {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int T=sj.nextInt();
		for(int k=0;k<T;k++)
		{
			int n=sj.nextInt();
			System.out.println("-"+ n+ "can be fitted in");
			
			if(n>=-128 && n<=128)
			{
				System.out.println("*"+ "byte");
			}
			if(n>=-32768 && n<=32768)
			{
				System.out.println("*"+ "short");
			}
			if(n>=-2147483648&& n<=2147483648)
			{
				System.out.println("*"+ "int");
			}
			else
			{
				System.out.println("* long");
			}
			
			
			
		}
		
	}

}
