import java.util.Scanner;


public class quadratic {

	
	public static void main(String[] args) {
	Scanner sj=new Scanner(System.in);
	int a=sj.nextInt();
	int b=sj.nextInt();
	int c=sj.nextInt();
	int determinant=b*b-4*a*c;
	
	if(determinant>0)
	{
		System.out.println("real and distinct");
	}
	if(determinant==0)
	{
		System.out.println("real and equal");
	}
	if(determinant<0)
	{
		System.out.println("imaginary");
	}
	if(determinant>=0)
	{
		float e=(float)Math.pow(determinant,0.5);
		float f=(-b+e);
		int i=(int)f/(2*a);
		float g=(-b-e);
		int j=(int)g/(2*a);
		System.out.println(j +"\t" +i);
		
		
	}

	}

}
