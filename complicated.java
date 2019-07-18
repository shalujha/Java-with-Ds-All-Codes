import java.util.Scanner;

public class complicated {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int row = 1;
		int nst = 1;
		int val = 1;
		
		while (row <= n + 1) {

			int temp = 1;
			int cst = 1;
			
			int count=0;
			while (cst <= nst) {

				if (cst % 2 == 0) {
					System.out.print("* ");
				}

				else {
					if (row % 2 == 0) {
						val = val + row - temp;
						System.out.print(val + " ");
						val--;
						temp++;
					} else {
						if (row == 1) {
							System.out.println(val + " ");
							val++;
						} else {
							if(cst==1)
							{
								val=val+row+count;
							System.out.print(val+ " ");
							count++;
							val++;
							}
							else
							{
								System.out.print(val+" ");
								val++;
							}
							
							
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
