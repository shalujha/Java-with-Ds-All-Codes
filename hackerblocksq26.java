import java.util.Scanner;


public class hackerblocksq26 {

	

		
		    static Scanner sc = new Scanner(System.in);
		    public static void main(String args[]) {
		      // 	Scanner sc = new Scanner(System.in);
				long[] arr = takeinput();
				//Scanner scn = new Scanner(System.in);
				long M = sc.nextLong();
				System.out.println(binarysearch(arr, M));

			}

			public static long[] takeinput() {
			//	Scanner sc = new Scanner(System.in);
				//System.out.println("size?");
				int N = sc.nextInt();

				long[] arr = new long[N];
				for (int i = 0; i <arr.length; i++) {
					arr[i] = sc.nextLong();
				}
				return arr;
			}

			public static int binarysearch(long[] arr, long M) {
				int lo = 0;
				int hi = arr.length - 1;
				while (lo <= hi) {
					int mid = (lo + hi) / 2;
					if (arr[mid] > M) {
						hi = mid - 1;
					} else if (arr[mid] < M) {
						lo = mid + 1;
					} else {
						return mid;
					}
				}
				return -1;


		    }
		}
	


