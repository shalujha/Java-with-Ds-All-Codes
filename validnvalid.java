import java.util.Scanner;

public class validnvalid {

	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		long N = sj.nextLong();
		long prev = sj.nextLong();
		boolean flag = false;
		boolean valid = true;
		for (int i = 2; i <= N; i++) {
			long curr = sj.nextLong();
			if (curr > prev) {
				flag = true;
			}
			if (prev > curr && flag == true) {
				valid = false;
			}
			prev = curr;
		}
		System.out.println(valid);
	}

}
