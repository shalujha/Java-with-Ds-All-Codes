import java.util.Scanner;


public class conversion1 {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int minimum=sj.nextInt();
		int maximum=sj.nextInt();
		int step=sj.nextInt();
		for(int i=minimum;i<=maximum;i=i+step)
		{
			int celsius=(5/9)*(i-32);
			System.out.println(i +"\t" + celsius);
			
		}

		
		
	}

}

