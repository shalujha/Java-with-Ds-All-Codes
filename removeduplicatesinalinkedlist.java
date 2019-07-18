import java.util.LinkedList;
import java.util.Scanner;

public class removeduplicatesinalinkedlist {

	public static void main(String[] args) {

		Scanner sj=new Scanner(System.in);
		LinkedList<Integer>list=new LinkedList<>();
		int t=sj.nextInt();
		for(int i=1;i<=t;i++)
		{
			int n=sj.nextInt();
			while(n!=0)
			{
			list.addLast(sj.nextInt());
			n--;
			}
			remove(list);
			System.out.println(list);
		}
		
		
		public  void remove(LinkedList list)
		{
			
		}
		
	}

}
