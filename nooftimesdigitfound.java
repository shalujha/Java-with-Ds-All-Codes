import java.util.Scanner;


public class nooftimesdigitfound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,r,count=0,a;
		Scanner sj=new Scanner(System.in);
		System.out.println("enter any no");
		no=sj.nextInt();
		System.out.println("enter digit");
		a=sj.nextInt();
		while(no!=0)
		{
			r=no%10;
			if(r==a)
			{
				count++;
			}
			no=no/10;
			
			
		}
		System.out.println(count);

	}

}
