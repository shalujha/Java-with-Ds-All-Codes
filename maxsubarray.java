import java.util.Scanner;


public class maxsubarray {

	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int T=sj.nextInt();
		int N = sj.nextInt();
        int[] arr = new int[ N ];
		for(int i=0;i<T;i++)
		{
	        for (int j = 0; i < N; j++)
	        {
	            arr[j] = sj.nextInt();
	    
			    
	    
	         N = arr.length; 
	         int max = Integer.MIN_VALUE;
	        for ( j = 0; j < N; j++)
	        {
	            int sum = 0;
	            for (int k = i; k < N; k++)
	            {
	                sum += arr[k];
	                if (sum > max)
	                    max = sum;
	            }
	        }
	        System.out.println(max);    
	    }
	}
		}

	}


