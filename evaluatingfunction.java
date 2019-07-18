import java.math.BigInteger;
import java.util.Scanner;


public class evaluatingfunction {

		public static void main(String[] args) {
	
			Scanner sj=new Scanner(System.in);
			BigInteger n=sj.nextBigInteger();
			byte[] a=(3*n*n)-n+10;
			BigInteger big1=new BigInteger(a);
			byte[] b=(4*n*n*n)+(2*n*n)-5*n+4;
			BigInteger big2=new BigInteger(b);
			BigInteger sum= big1.add(big2); 
		      System.out.println(sum );

	}

}
