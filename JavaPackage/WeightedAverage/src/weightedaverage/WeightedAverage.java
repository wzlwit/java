package weightedaverage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WeightedAverage extends JFrame {

    private JLabel scrL, wghtL, result;
    private JTextField scrTF, wghtTF;
    private JButton calBtn;
    int i = 0;
    double sum = 0, x[] = new double[10], y[] = new double[10];

    private ScoreBtnHandler scrBtnHdler;
    private WeightBtnHandler wghtBtnHdler;
    private CalculateBtnHandler calBtnHdler;

    public WeightedAverage() {
        setTitle("Weighted Average (max 10 group of data");
        setLocation(500, 400);
        setSize(500, 200);

        scrL = new JLabel("TestScore: ");
        wghtL = new JLabel("Weight: ");
        scrTF = new JTextField(6);
        wghtTF = new JTextField(6);
        calBtn = new JButton("Calculate");
        result = new JLabel("");

        Container pane = getContentPane();
        pane.setLayout(new GridLayout(3, 2));
        pane.add(scrL);
        pane.add(scrTF);
        pane.add(wghtL);
        pane.add(wghtTF);
        pane.add(calBtn);
        pane.add(result);

        scrTF.addActionListener(scrBtnHdler);
        wghtTF.addActionListener(wghtBtnHdler);
        calBtn.addActionListener(calBtnHdler);
        
        scrTF.setToolTipText("please enter number");
        wghtTF.setToolTipText("please enter weight");
               
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ScoreBtnHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            x[i] = Double.parseDouble(scrTF.getText());
            result.setText("null");
        }
    }

    private class WeightBtnHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            y[i] = Double.parseDouble(wghtTF.getText());
            i++;
            result.setText("null");

        }
    }

    private class CalculateBtnHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            for (i = 0; i < 10; i++) {
                sum = sum + x[i] * y[i];
                result.setText("" + sum);
                i=0;
                scrL.setText("Test Score, number 1: ");

                wghtL.setToolTipText("Weight, number 2: ");
            }
        }
    }

    public static void main(String[] args) {
        WeightedAverage wScore = new WeightedAverage();
    }

}
