/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconv;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author cstuser
 */
public class Temp extends JFrame {

    public JLabel fJL = new JLabel("temperature F");
    Container pane;

    public void Temp() {
        setSize(200, 60);
        setTitle("Temperature Converter");
        setLocation(800, 400);
        setVisible(true);
        pane = getContentPane();
        pane.add(fJL);
    }
}
