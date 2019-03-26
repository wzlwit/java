
package test;
import java.util.Scanner;
public class Test {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int num, out;
        System.out.print("please enter the number of locker: ");
        num = console.nextInt();
        
        boolean lock[] = new boolean[num];
        int i,j;
        
        int length = (int)(Math.log10(num)+1);
        String fmt = "%"+length+"d ";
                
        for(i=0; i<num; i++) lock[i]=true;
        
        for(j=2;j<=num; j++) //开关号码
        {   for(i=0; i<num; i++) //locker number
                if ((i+1)%j == 0) lock[i] = !lock[i];
        }
        
        System.out.println("\nLockers which are open are: ");
        j=0; //10 numbers to return
        for (i=0; i<num; i++) 
            if (lock[i] == true) 
            {System.out.printf(fmt,(i+1));
                j++;
                if (j%10==0) System.out.println();
            }
        System.out.println();
    }
}
