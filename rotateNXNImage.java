import java.util.Scanner;
public class rotateNXNImage {
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int n=sj.nextInt();
		int[][]arr=new int[n][n];
		int bottom=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sj.nextInt();
			}
		}
		int[][]brr=new int[n][n];
		int i=0;
		while(i<arr.length)
		{
			int j=0;
			while(j!=arr[i].length)
			{
				brr[i][j]=arr[j][i];
				j++;
			}
			System.out.println();
			i++;
		}
		int[]array=new int[n*n];
		int[][]crr=new int[n][n];
		int p=0;
		for(int k=0;k<brr.length;k++)
		{
			for(int m=brr.length-1;m>=0;m--)
			{

			array[p]=brr[m][k];
			p++;
			}	
		}
		p=0;
		for(int k=0;k<crr.length;k++)
		{
			for(int m=0;m<crr.length;m++)
			{
				crr[m][k]=array[p];
				p++;
			}
		}
		/*for(int k=0;k<array.length;k++)
		{
			System.out.print(array[k]+" ");
		}*/
		for(int l=0;l<crr.length;l++)
		{
			for(int j=0;j<crr[l].length;j++)
			{
				System.out.print(crr[l][j]+" ");
			}
			System.out.println();
		}
		//  4
	//	1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
		

		
	}

}
