/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectbox;

public class Box extends Rectangle {
    private double h;
    public void setx(double v){
        x=v;
    }
    public  String toString(){
        return super.toString()+"//"+h;
    }
    
}
