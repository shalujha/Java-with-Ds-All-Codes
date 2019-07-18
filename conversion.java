import java.util.Scanner;


public class conversion {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int i,c;
		int MinimumFarenheitValue=sj.nextInt();
		int MaximumFarenheitValue=sj.nextInt();
		int Step=sj.nextInt();
		for(i=MinimumFarenheitValue;i<=MaximumFarenheitValue;i=i+Step)
		{
			c=(int)((5.0/9)*(i-32));
		
		System.out.println(i +"\t"+c);
		}
	}

}
