import java.util.Scanner;


public class wavePrintColumnWise {

	
	public static void main(String[] args) {
	
		Scanner sj=new Scanner(System.in);
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 },
				{ 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		for(int col=0;col<arr.length;col++)
		{
			for(int row=0;row<arr.length;row++)
			{
				System.out.print(arr[row][col]+" ");
			}
		}

	}

}
