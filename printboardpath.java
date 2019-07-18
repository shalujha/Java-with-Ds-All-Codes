import java.util.Scanner;


public class printboardpath {

	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int curr=sj.nextInt();
		int end=sj.nextInt();
		int count=boardpath(curr,end," ");
		System.out.println(count);
		board(curr,end," ");
		

	}
	
	public static int boardpath(int curr,int end,String ans)
	{
		if(curr==end)
		{
		
			return 1;
		}
		int count=0;
		
		if(curr>end)
		{
			return 0;
		}
		for(int dice=1;dice<=6;dice++)
		{
		count+=	boardpath(curr+dice,end,ans+dice);
		}
		
		return count;
	}
	
	public static void board(int curr,int end,String ans)
	{
		if(curr==end)
		{
			System.out.print(ans);
			return ;
		}
		
		
		if(curr>end)
		{
			return ;
		}
		for(int dice=1;dice<=6;dice++)
		{
			board(curr+dice,end,ans+dice);
		}
		
		
	}


}
