import java.util.Scanner;


public class javaEOF {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int i=1;
		while(sj.hasNext())
		{
			System.out.println(i+" "+ sj.nextLine());
			i++;
		}

	}

}
