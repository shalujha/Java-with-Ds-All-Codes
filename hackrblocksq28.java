import java.util.Scanner;


public class hackrblocksq28 {

		    public static void main(String args[]) {

		  Scanner sc= new Scanner(System.in);
		         int N = sc.nextInt();
		         
		         int row = 1;
		         int nsp = N-1;
		         int nst = 1;
		         
		         while(row<=N) {
		        	 int csp = 1;
		        	 
		        	 while(csp<=nsp) {
		        		 System.out.print(" ");
		        		 csp++;
		        	 }
		        	 int cst = 1;
		        	 int val =row;
		        	 while(cst<=nst) {
		        		 System.out.print(" "+val);
		        		 
		        		 if(cst<=nst/2) {
		        			 val++;
		        		 }
		        		 else
		        		{
		        			 val--;
		        			 }
		        		 cst++;
		        	 }
		        	 
		        	 System.out.println();
		        	 nsp--;
		        	 nst = nst +2;
		        	 row++;
		         }
		    }
		}

		
			


