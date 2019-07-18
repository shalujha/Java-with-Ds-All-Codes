
public class pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i,j,k,a=5;
		for(i=1;i<=5;i++)
		{
			for(j=0;j<=i-1;j++)
			{
				System.out.print(" ");
				for(k=1;k<=a;k++)
				{
					System.out.print("*");
				}
				a--;
			
			System.out.println();
			}
		}

	}

}
