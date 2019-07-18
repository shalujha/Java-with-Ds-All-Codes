import java.util.Scanner;


public class quadraticequation {

	
	public static void main(String[] args) {
		Scanner gg=new Scanner(System.in);
		int a,b,c;
		float discriminant;
		a=gg.nextInt();
		b=gg.nextInt();
		c=gg.nextInt();
		discriminant= b*b-4*a*c;
		if(discriminant>0)
		{
			System.out.println("real and distinct");
		}
		if(discriminant==0)
		{
			System.out.println("equal roots");
			
		}
		if(discriminant<0)
		{
			System.out.println("no real roots");
		}
			float number=discriminant;
			double squareRoot=Math.sqrt(number);
			int i=(int)squareRoot; 
		
	int d=-(b) + i;
	int e=2*a;
	int f=d/e;
	System.out.print(f);
	int g=-(b) - i;
	int h=g/e;
	System.out.print(" "+h);

		
		

	}

}
