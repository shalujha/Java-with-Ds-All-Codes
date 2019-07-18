import java.util.Scanner;


public class conversionanytoany {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int sb,db,sn=0,N,r,decimal=0,power=1,b=1;
		sb=sj.nextInt();
		db=sj.nextInt();
		N=sj.nextInt();
			while(N!=0)
			{
				r=N%10;
				decimal=decimal+power*r;
				
				N=N/10;
				power=power*sb;
				
			}
			while(decimal!=0)
			{
				r=decimal%db;
				sn=sn+b*r;
				decimal=decimal/db;
				b=b*10;
			}
			System.out.println(sn);
		}
		
	}

	


