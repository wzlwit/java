/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author wang
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //if  no break, all the statements will be executed, day=31, then day=28, then day=30;finally will be 30
        //with the help of break, cases are grouped. in one group, all the statements will be executed, no matter whic case it belongs to.
        int year = 2015;
        int month = 4;
        int day = 0;
        switch (month) {
            case 1:
                year = 2017;
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
        }

        System.out.println("year:" + year + " day:" + day);

    }

}
