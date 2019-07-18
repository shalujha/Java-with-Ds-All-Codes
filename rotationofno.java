import java.util.Scanner;


public class rotationofno {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 1;
		int ans = 0;
		
		while(num!=0) {
			int rem = num%10;
			ans = ans+count*(int)Math.pow(10, rem-1);
			count++;
			num = num /10;
			
		}
		System.out.println(ans);
		

	}

}


	


