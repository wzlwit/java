package test;

import java.util.Scanner;
public class Test {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        double loan, pay, rate;
        int i;
                
        System.out.print("please enter your loan for 20 years: ");
        loan = console.nextDouble();
        System.out.print("please enter the rate: ");
        rate = console.nextDouble();
        //monthly rate:
        rate = rate/2400; 
        System.out.println("the minimum payment is  " + (loan*rate));
        System.out. printf("bi-weekly rate is %.5f : \n", rate);

        System.out.print("please enter bi-weekly payment:");
        pay = console.nextDouble();
        
        for (i=1; loan > 0; i++) loan = loan*(1+rate) -pay;
        
        System.out.printf("\nThe time to pay out is %d bi-weeks or %.2f year!\n",i,(i/26.0));
        System.exit(0);
        
    }
}