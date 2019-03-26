
package test;

import java.util.Scanner;

public class Test {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int num, out;
        System.out.print("please enter the number of queue: ");
        num = console.nextInt();

        int length = (int) (Math.log10(num) + 1);
        String format = "%-" + length + "d ";

        System.out.print("please enter the number to queue out: ");
        out = console.nextInt();

        int q[] = new int[num], i, j = 0, all = 0;
        for (i = 0; i < num; i++)
            q[i] = i + 1;

        for (i = 0; i < num; i++) {
            if (q[i] > 0) {
                j++;
                if (j == out) {
                    System.out.printf(format, q[i]);
                    q[i] = 0;
                    j = 0;
                    all++;
                    if (all % 10 == 0)
                        System.out.println();
                }
            }
            if (all == num)
                break;
            if (i == num - 1)
                i = -1;

        }
        System.out.println();
        System.exit(0);
    }
}