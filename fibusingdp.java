import java.util.Scanner;

public class fibusingdp {

	public static long start;
	public static long end;

	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;

	}

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		startAlgo();
		System.out.println(fib(n));
		System.out.println("time taken by simple fibonacci is"+endAlgo()+ "ms");
		startAlgo();
		int[] arr = new int[n + 1];
		System.out.println(fibrs(n, arr));
		System.out.println("time taken by dp using recursion is"+ endAlgo()+"ms");
		startAlgo();
		System.out.println(fibI(n, arr));
		System.out.println("time taken by iteration method"+ endAlgo()+"ms");

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = fib(n - 1);
		int fnm2 = fib(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}

	public static int fibrs(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}

		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibrs(n - 1, strg);
		int fnm2 = fibrs(n - 2, strg);
		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;
	}

	public static int fibI(int n, int[] strg) {

		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		return strg[n];
	}

}
