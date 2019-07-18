import java.util.Scanner;


public class rec2 {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		recseries(n);
		
	}
	

	public static void recseries(int n) {
		if (n == 0) {
			return;
		}

		recseries(n - 1);
		System.out.println(n);

	}

}
