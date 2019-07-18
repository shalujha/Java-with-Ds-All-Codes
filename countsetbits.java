import java.util.Scanner;


public class countsetbits {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int i=1,r,binary;
	int	N=sj.nextInt();
	while(i<=N)
	{
		int j=sj.nextInt();
		  binary=0;
		int power=1;
		while(j!=0)
		{
			r=j%2;
		binary=binary+r*power;
		
		power=power*10;
		j=j/2;
			
		}
		
		
	int count=0;
	while(binary!=0)
	{
		r=binary%10;
		if(r==1)
		{
			count++;
		}
		binary=binary/10;
		}
	System.out.println(count);
		i++;
	}
		

	}
}

