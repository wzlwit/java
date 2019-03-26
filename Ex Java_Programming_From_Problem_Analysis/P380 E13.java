package rtwo;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RTwo extends JFrame {

    private static final int WIDTH = 200, HEIGHT = 150;
    private JLabel l, w, ar;

    public RTwo() {
        setTitle("Good day Area");
        l = new JLabel("Enter the length:", SwingConstants.RIGHT);
        w = new JLabel("Enter the width: ", SwingConstants.RIGHT);
        ar = new JLabel("Area: ", SwingConstants.RIGHT);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(3, 1));
        pane.add(l);
        pane.add(w);
        pane.add(ar);

        setLocation(500, 500);
        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        RTwo r2 = new RTwo();
    }

}