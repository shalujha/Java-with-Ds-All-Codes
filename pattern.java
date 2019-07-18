public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, m = 3, n = 1, j, k;
		for (i = 1; i <= 4; i++) {
			for (j = 1; j <= m; j++) {
				System.out.print(" ");
				for (k = 1; k <= n; k++) {
					System.out.print("*");

				}
				n = n + 2;
System.out.println();
			}
		m=m-1;	

		}

	}
}