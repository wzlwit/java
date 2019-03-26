package test;

import java.util.Scanner;
public class Test {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) 
    {   double m, n,rent, rise,cost;//
        int num,x; //x: number of vacant app.
        
        System.out.print("please enter the number of apartment unit: ");
        num = console.nextInt();
        System.out.print("please enter the rent to occupy all the units ");
        rent = console.nextDouble();
        System.out.print("please enter the increase in rent that results"
                + " in a vacant unit: ");
        rise = console.nextDouble();
        System.out.print("please enter the amount to maintain a rented unit: ");
        cost = console.nextDouble();
        m = (rent - cost)*num;
       
        for (x=1; x<num; x++)
        {   n = (rent + rise*x-cost)*(num - x);
            if (n<m)
            {   System.out.println("\nThe number of units to be rented is: " + (num-x));
                break;
            }
            else m=n;
        }
        
        System.exit(0);
    }
}