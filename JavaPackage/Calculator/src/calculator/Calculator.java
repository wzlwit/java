package calculator;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    static char op, ch;
    boolean nn1 = false, nn2 = false;
    public int width = 305, height = 220;
    double result;
    int minus = 1;
    String buff = "", input = "", sign = "",
            btnText[] = {
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", "C", "=", "+"};
    JTextField display = new JTextField(240);
    Container pane = getContentPane();
    JButton[] keyJB = new JButton[16];

    public Calculator() {
        setTitle("My Calculator");
        setSize(width, height);
        int posX = 5, posY = 20;
        for (int i = 0; i < keyJB.length; i++) {
            keyJB[i] = new JButton(btnText[i]);
            keyJB[i].setSize(70, 30);
            if (i % 4 == 0) {
                posY += 30;
                posX = 5;
            }
            keyJB[i].setLocation(posX, posY);
            posX += 70;
            keyJB[i].addActionListener(this);
            pane.add(keyJB[i]);
        }
        display.setSize(280, 30);
        display.setHorizontalAlignment(JTextField.RIGHT);
        pane.setLayout(null);
        pane.add(display);
        display.setLocation(5, 5);
        setLocation(800, 400);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

    public void transmit() {
        buff = input;
        nn1 = true;
        input = "";
        nn2 = false;
    }

    public void evaluate() {
        double x = Double.parseDouble(buff);
        double y = Double.parseDouble(input) * minus;
        switch (op) {
            case '/': {
                result = x / y;
                break;
            }
            case '*': {
                result = x * y;
                break;
            }
            case '-': {
                result = x - y;
                break;
            }
            case '+': {
                result = x + y;
                break;
            }
        }
    }

    public void setSign() {
        if (minus == -1) {
            sign = "-";
        } else {
            sign = "";
        }
    }

    public static void main(String[] args) {
        Calculator myCal = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        ch = e.getActionCommand().charAt(0);
        switch (ch) {
            case 'C': {
                buff = "";
                nn1 = false;
                input = "";
                nn2 = false;
                display.setText("");
                minus = 1;
                setSign();
                op = '\u0000';
                break;
            }
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': {
                if (op == '=') {
                    input = "";
                }
                input = input + ch;
                nn2 = true;
                if (nn1 == true) {
                    display.setText(buff + op + sign + input);
                } else {
                    display.setText(input);
                }
                break;
            }
            case '-': {
                if (op != '=' && nn2 == false) {
                    minus *= -1;
                    setSign();
                    display.setText(buff + op + sign);
                    break;
                }
            }
            case '/':
            case '*':
            case '+': {
                if (nn1 == true) {
                    if (nn2 == true) {
                        evaluate();
                        transmit();
                        minus = 1;
                        setSign();
                        buff = result + "";
                        op = ch;
                        display.setText(buff + op);
                    } else {
                        op = ch;
                        minus = 1;
                        setSign();
                        display.setText(buff + op);
                    }
                } else {
                    op = ch;
                    display.setText(input + op);
                    if (nn2 = true) {
                        transmit();
                    }
                }
            }
            case '=': {
                if (nn1 == true && nn2 == true) {
                    evaluate();
                    buff = "";
                    nn1 = false;
                    minus = 1;
                    setSign();
                    input = "" + result;
                    nn2 = true;
                    op = '=';
                    display.setText(input);
                }
            }
        }
    }
}
