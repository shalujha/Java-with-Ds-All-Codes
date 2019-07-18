public class countingsort {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 1, 2, 7, 5, 2 };

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int count = 0;
		for (int j = min; j <= max; j++) {
			count++;
		}

		int[] brr = new int[count + 1];

		for (int j = 0; j < brr.length; j++) {
			count = 0;

			for (int i = 0; i < arr.length; i++) {
				if (j == arr[i]) {
					count++;
				}
			}

			brr[j] = count;
		}
		int[]crr=new int[brr.length];
		for(int i=0;i<brr.length;i++)
		{
			int sum=0;
			for(int j=0;j<=i;j++)
			{
				sum+=brr[j];
				
			}
			
			crr[i]=sum;
		
		}
	
		int[]drr=new int[brr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int val=arr[i];
			for(int j=0;j<brr.length;j++)
			{
				for(int k=0;k<crr.length;k++)
				{
					int val1=brr[val];	
					for(int l=0;l<brr.length;l++)
					{
						drr[val1]=val;
						brr[val]=val1-1;
					}
				}
			}
		}
	
		
		for (int i = 0; i < drr.length; i++) {
			System.out.println(drr[i]);
		}

		
	}
}
