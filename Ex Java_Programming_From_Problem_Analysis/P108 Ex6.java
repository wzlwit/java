package test;
import javax.swing.JOptionPane;


public class Test {

    public static void main(String[] args) {
        Double x;
        int y;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("please enter a decimal number"));
        JOptionPane.showMessageDialog(null,"The nearest integer to your number is" 
                + String.format("%.0f",x),"The Nearest Integer", JOptionPane.INFORMATION_MESSAGE);
           

    }