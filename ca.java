import java.util.Scanner;


public class ca {

	
	public static void main(String[] args) {
		

	
				Scanner sj = new Scanner(System.in);

				int n = sj.nextInt();
				int row = 1;
				int nst = 1;
				int val = 1;
				while (row <= n + 1) {

					int cst = 1;
					while (cst <= nst) {
						if (cst % 2 == 0) {
							System.out.print("* ");
						}
						if (cst % 2 != 0) {
							if (row % 2 != 0) {

								System.out.print(val + " ");
								val++;
							} else {
								while (cst >= nst) {
									System.out.print(val + " ");
									val++;
									cst = cst - 2;
								}
							}
							
						}
						cst++;
					}
					System.out.println();
					nst = nst + 2;
					row++;
				}
			}
		
	

}
