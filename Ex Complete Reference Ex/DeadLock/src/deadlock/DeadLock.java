/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deadlock;

/**
 *
 * @author wang
 */

// P443
public class DeadLock implements Runnable {

    /**
     * @param args the command line arguments
     */
    A a = new A();
    B b = new B();
    Thread t;

    public DeadLock() {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "RacingThread");
    }
    void deadLockStart(){
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }
    public void run(){
        b.bar(a);
        System.out.println("Back in other thread");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        DeadLock dl=new DeadLock();
        dl.deadLockStart();
    }

}
