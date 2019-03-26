/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handleerror;

import java.util.Random;

/**
 *
 * @author wang
 */
public class HandleError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 32; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }

}
