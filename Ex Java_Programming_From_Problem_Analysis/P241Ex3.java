package test;
import javax.swing.JOptionPane;

public class Test 
{
    public static void main(String[] args) 
    {
    int num;
    
    num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 0 and 35: "));
    
    if (num>=0 && num<10)
        JOptionPane.showMessageDialog(null,"The number is: "+num,"RERSULT",JOptionPane.INFORMATION_MESSAGE);
    else if (num <=35)       
        JOptionPane.showMessageDialog(null,"The number is transfered to: "+(char)(num+55),"RERSULT",JOptionPane.INFORMATION_MESSAGE);
    else
        JOptionPane.showMessageDialog(null,"You entered a wrong number","Warning",JOptionPane.WARNING_MESSAGE);
    }    
}
