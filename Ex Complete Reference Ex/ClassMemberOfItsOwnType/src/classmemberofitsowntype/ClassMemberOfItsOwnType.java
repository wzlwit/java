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
public class ClassMemberOfItsOwnType {

    public class abc {

        private int t = 10;
        private abc p;

        public abc() {
            p = this;
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Abc a = new Abc();
//        def d = new def();
    }

}
