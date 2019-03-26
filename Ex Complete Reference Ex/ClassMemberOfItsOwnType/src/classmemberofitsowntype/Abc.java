/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmemberofitsowntype;

/**
 *
 * @author wang
 */
public class Abc {

    private int t = 10;
    private Abc p;

    public Abc() {
        p = this;
        System.out.println(p);
    }
}
