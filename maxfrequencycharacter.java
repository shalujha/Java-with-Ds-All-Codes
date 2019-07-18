import java.util.Scanner;


public class maxfrequencycharacter {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		String S=sj.next();
		int c;
		int[]A=new int[S.length()];
		for(int i=1;i<S.length();i++)
		{
			int max=Integer.MIN_VALUE;
			int counter=0;
			for(int j=0;j<S.length();j++)
			{
			
			if(S.charAt(i-1)==S.charAt(i))
					{
				counter++;
					}
			
			A[j]=counter;
		}
		

	
		
		for(int j=0;j<S.length();j++)
		{
			
			if(A[j]>max)
			{
				max=A[j];
			
			}
		 
		}
	
		System.out.println(max);
		
	}
		
	}
}