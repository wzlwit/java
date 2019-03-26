/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclass;

/**
 *
 * @author wang
 */
public class SubClass extends SuperClass {

    private int y;

    public void print() {
        System.out.println("SubClass: " + y);
        super.print();
    }

    public SubClass() {
        super();
        y = 0;
    }

    public SubClass(String s, int a, int b) {
        super("Hello Super", a + b);
        y = b;
    }
}
