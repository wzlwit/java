/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author wang
 */
//<<Complete Reference>> P415
class NewThread implements Runnable {

    Thread t;

    public NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }

}

public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewThread nt = new NewThread();
        nt.t.start();
//        nt.run(); // works like single thread, not create a thread, just invoke an object's method
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }

}
