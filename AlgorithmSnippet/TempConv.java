
package tempconv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TempConv extends JFrame 
{
    private JLabel TcL, TfL;
    private JTextField TcTF, TfTF;

    public TempConv() {
        setSize(700, 60);
        setLocation(500, 300);
        setTitle("Temperature Conversion");

        TcL = new JLabel("Temperature in Celsius: ", SwingConstants.RIGHT);
        TfL = new JLabel("Temperature in Fahrenheit: ", SwingConstants.RIGHT);
        TcTF = new JTextField(7);
        TfTF = new JTextField(7);
        CelsiusHandler cHandler = new CelsiusHandler();
        FahrenheitHandler fHandler = new FahrenheitHandler();

        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 4));
        c.add(TcL);
        c.add(TcTF);
        c.add(TfL);
        c.add(TfTF);
        TcTF.addActionListener(cHandler);
        TfTF.addActionListener(fHandler);

        setVisible(true);
        setDefaultCloseOperation(1);
    }

    public static void main(String[] args) {
        TempConv tempConv = new TempConv();

    }

    private class CelsiusHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double c, f;
            c = Double.parseDouble(TcTF.getText());
            f = 9.0 / 5 * c + 32;
            TfTF.setText(String.format("%.2f", f));
        }
    }

    private class FahrenheitHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double c, f;
            f = Double.parseDouble(TfTF.getText());
            c = 5.0 / 9 * (f - 32);
            TcTF.setText(String.format("%.2f", c));
        }

    }

}
