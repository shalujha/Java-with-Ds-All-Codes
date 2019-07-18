import java.util.ArrayList;
import java.util.Scanner;

public class sum {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int m = sj.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sj.nextInt();
		}

		for (int j = 0; j < b.length; j++) {
			b[j] = sj.nextInt();
		}

		String str1 = "", str2 = "";

		for (int i = 0; i < a.length; i++) {
			str1 += a[i];
		}
		for (int j = 0; j < b.length; j++) {
			str2 += b[j];
		}

		int sum = 0;
		int n1 = Integer.valueOf(str1);
		int n2 = Integer.valueOf(str2);
		sum = n1 + n2;
		//System.out.println(sum);
		int reverse=0;
		ArrayList<Integer>list=new ArrayList<>();
		while(sum!=0)
		{
			int r=sum%10;
			reverse=reverse*10+r;
			sum/=10;
		}
		while(reverse!=0)
		{
			int r=reverse%10;
			list.add(r);
			reverse/=10;
		}
		System.out.println(list);

	}

}
