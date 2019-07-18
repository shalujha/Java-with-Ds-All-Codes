import java.util.Scanner;


public class arun {

	
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);

		 
		 int t=sc.nextInt();
		 for(int i=0;i<t;i++)
		 {
	        int k, result = 1;
	        long n = sc.nextLong();
	        k = sc.nextInt();

	        for (int x = 1; x <= n; x++) {
	            if (Math.pow(x, k) <= n) {
	                result = x;
	            } else {
	                break;
	            }
	        }

	        System.out.println(result);
		 }

	}

}
