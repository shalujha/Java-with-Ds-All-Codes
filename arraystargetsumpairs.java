import java.util.Scanner;

public class arraystargetsumpairs {
	static Scanner sj = new Scanner(System.in);

	public static void main(String[] args) {

		int[] c = takeInput();
		int[] d = bubblesort(c);

		targetsum(d);

	}

	public static int[] takeInput() {
		int N = sj.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		return arr;

	}

	public static int[] bubblesort(int[] c) {
		for (int i = 0; i < c.length - 1; i++) {
			for (int j = 0; j < (c.length - i - 1); j++) {
				if (c[j] > c[j + 1]) {
					int temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}

			}
		}
		return c;
	}

	public static void targetsum(int[] d) {
		int m = sj.nextInt();
		for(int i=0;i<d.length-2;i++)
		{
			int lo = i+1;
			int high = d.length - 1;
			
		while (lo < high) {
			if (d[lo] + d[high] + d[i]< m) {
				lo++;
			}
			if (d[lo] + d[high]+ d[i] > m) {
				high--;
			} else {
				System.out.println(d[i]+"\t"+ "," + "\t"+ d[lo]+"\t"+"and"+"\t"+d[high]);
				lo++;
			}
		}

	}
	}
}
