import java.util.Scanner;

public class maxfrequencycharacters {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		String S = sj.next();
		int i,j;
		char temp=0;
		int max = Integer.MIN_VALUE;
		for ( i = 0; i < S.length(); i++) {
			int count = 0;
			for ( j = i; j < S.length(); j++) {
				if (S.charAt(i) == S.charAt(j)) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				 temp=S.charAt(i);
			}
			
		}
		System.out.print(temp);
		

	

}
}