import java.util.Scanner;


public class shoppinggames {

	
	public static void main(String[] args) {
		int N, M, T, j;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			int se = 0, so = 0, p = 0;
			M = sc.nextInt();
			N = sc.nextInt();
			for (j = 1; M > 0 && N > 0; j++) {

				if (j % 2 == 0) {
					se = se + j;
					if (se > N) {
						p = 0;
						break;
					}
				}
				if (j % 2 != 0) {
					so = so + j;

					if (so > M) {
						p = 1;
						break;
					}
				}

			}

			if (p == 0)
				System.out.println("Aayush");
			if (p == 1)
				System.out.println("Harshit");
		}
	}
}

	


