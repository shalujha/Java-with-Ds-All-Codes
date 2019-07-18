import java.util.Scanner;


public class allindex {

	
	public static void main(String[] args) {
		Scanner sj = new Scanner(System.in);
		int n = sj.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sj.nextInt();
		}
		int item = sj.nextInt();
		int vidx = 0;
		int counter=0;
		int[]c=arrayallindex(arr,vidx,item,counter);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
	
	
	public static int[]arrayallindex(int[]arr,int vidx,int item,int counter)
	{
		if(vidx==arr.length)
		{
			int[]bres=new int[counter];
			return bres;
			
		}
		int[]recans;
		if(arr[vidx]==item)
		{
		recans=arrayallindex(arr,vidx+1,item,counter+1);
		recans[counter]=vidx;
		}
		else
		{
			recans=arrayallindex(arr,vidx+1,item,counter);
		}
		
			return recans;
		}
		
		
	}


