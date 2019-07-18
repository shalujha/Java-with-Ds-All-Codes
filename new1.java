import java.util.Scanner;


public class new1 {

	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();

		int nst = 1;
		int rows = 1;
		int cnt = 1;
		while (rows <= n + 1) {

			int cst = 1;

			if (rows % 2 == 1) {
				while (cst <= nst) {
					System.out.print(cnt);
					if (cst != rows)
						System.out.print("*");
					cst++;
					cnt++;
				}
			} else {
				int val = rows + cnt - 1;
				while (cst <= rows) {
					System.out.print(val);
					if (cst != rows)
						System.out.print("*");
					val--;
					cnt++;
					cst++;
				}

			}

			nst++;
			System.out.println();
			rows++;
		}



	}

}
