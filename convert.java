import java.util.Scanner;


public class convert {

	
	public static void main(String[] args) {
		int decimal=0,sn=0,power=1,p=1,r,rem;
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        int N=sc.nextInt();
        while(N!=0){
            r=N%10;
            decimal=decimal+r*power;
            N/=10;
            power=power*sb;
        }
        while(decimal!=0){
            rem=decimal%db;
            sn=sn+p*rem;
            decimal/=db;
            p=p*10;
        }
        System.out.println(sn);

	}

}
