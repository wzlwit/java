package test;
import java.util.Scanner;
public class Test {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
       int[] num = new int[10];
       int sum=0, i,l;
       String str;
       
       System.out.print("please enter the number: ");
       str = console.next();
       l = str.length();
       
       System.out.print("The individule digits of the number is : ");
       for(i=0; i<l ;i++){
           num[i]=str.charAt(i) - 48;
           sum = sum + num[i];
           System.out.print(num[i] + " ");
       }
    }
}