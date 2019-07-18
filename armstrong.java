import java.util.Scanner;


public class armstrong {

	
	public static void main(String[] args) {
		Scanner sj=new Scanner(System.in);
		int no,c;
		no=sj.nextInt();
		 c=  armstrong(no);
		 if(c==0)
		 {
			 System.out.println(" not an armstrong no");
			 
		 }
		 else
		 {
			 System.out.println(" is an armstrong no");
		 }

	}
	

public static int armstrong(int no)
{
	int count=0,r,ans=0;
	int a=no;
	int t =no;
	
	while(no!=0)
	{
		r=no%10;
		count++;
		no=no/10;
		
	}
	while(a!=0)
	{
		r=a%10;
		ans=ans+(int)Math.pow(r,count);
		a=a/10;
	}
	if(ans==t)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	
		
}
}

		
	
	
	
	

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


