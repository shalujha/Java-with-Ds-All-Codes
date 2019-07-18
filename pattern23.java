
 import java.util.*;
public class pattern23{
    public static void main(String args[]) {
        int nst=1,row=1;
        int val=1;
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int nsp=N-1;
        while(row<=2*N-1){
           if(row<=N){
               val=row;
           }
           else{
               val=N-1;
           }
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print(val+" ");
                if(cst<=nst/2)
                val++;
                else
                val--;
                cst++;
            }
            System.out.println();
            
            if(row<=N-1){
                
                 nsp--;
            nst=nst+2;
            
            }
            else{
                nsp++;
                nst=nst-2;
                
            }
        row++;
       
        }
    }
}


    