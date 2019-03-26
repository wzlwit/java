package RecPrg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RecPrg extends JFrame {
    private JLabel lL, wL, periL, arL;
    private JTextField lTF, wTF, periTF, arTF;
    private JButton calB, exB;

    private CalBtnHandler cbHandler;
    private ExBtnHandler ebHandler;

    public RecPrg() {
        setTitle("Arean and Perimeter of a Rectangle");
        setLocation(700, 400);
        setSize(300, 200);

        lL = new JLabel("Enter the length: ", SwingConstants.RIGHT);
        wL = new JLabel("Enter the width: ", SwingConstants.RIGHT);
        arL = new JLabel("Area: ", SwingConstants.RIGHT);
        periL = new JLabel("Perimeter: ", SwingConstants.RIGHT);

        lTF = new JTextField(10);
        wTF = new JTextField(10);
        arTF = new JTextField(10);
        periTF = new JTextField(10);

        calB = new JButton("Calcualte");
        exB = new JButton("Exit");

        cbHandler = new CalBtnHandler();
        ebHandler = new ExBtnHandler();

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(5, 2));

        pane.add(lL);
        pane.add(lTF);
        pane.add(wL);
        pane.add(wTF);
        pane.add(arL);
        pane.add(arTF);
        pane.add(periL);
        pane.add(periTF);
        pane.add(calB);
        pane.add(exB);

        calB.addActionListener(cbHandler);
        exB.addActionListener(ebHandler);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        RecPrg rect = new RecPrg();
    }

    private class CalBtnHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double w, l, ar, peri;

            l = Double.parseDouble(lTF.getText());
            w = Double.parseDouble(wTF.getText());
            ar = l * w;
            peri = 2 * (l + w);
            arTF.setText("" + ar);
            periTF.setText("" + peri);
        }
    }

    private class ExBtnHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }

    }
}