import java.util.Scanner;

public class kuldeppattern {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int N = sj.nextInt();
		int nst = N ;
		int row = 0;
		
		while (row < N) {
			int val = N ;	
			int cst = 1;
			while (cst <= nst) {
				for (int j = 1; j <= N-row; j++) {
					System.out.print(val);
				}
				val--;
				cst++;
			}
			System.out.println();
			
			row++;

		}

	}

}
