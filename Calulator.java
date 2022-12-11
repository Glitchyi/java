import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;

class Buttons implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Button Clicked");
    }

}

public class Calulator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        Vector<JButton> buttons = new Vector<JButton>();
        int x = 10, y = 10;
        // for (int i = 9; i > 0; i--) {
        //     JButton b = new JButton(Integer.toString(i));
        //     b.setBounds(x,y, 50, 50);
        //     x += 60;
        //     if ((i+2)%3 == 0) {
        //         x = 10;
        //         y += 60;
        //     }
        //     buttons.add(b);
        //     f.add(b);
        // }
        JButton b1 = new JButton("1");
        b1.setBounds(10, 10, 50, 50);
        f.add(b1);
        JButton b2 = new JButton("2");
        b2.setBounds(70, 10, 50, 50);
        f.add(b2);
        JButton b3 = new JButton("3");
        b3.setBounds(130, 10, 50, 50);
        f.add(b3);
        JButton b4 = new JButton("4");
        b4.setBounds(10, 70, 50, 50);
        f.add(b4);
        JButton b5 = new JButton("5");
        b5.setBounds(70, 70, 50, 50);
        f.add(b5);
        JButton b6 = new JButton("6");
        b6.setBounds(130, 70, 50, 50);
        f.add(b6);
        JButton b7 = new JButton("7");
        b7.setBounds(10, 130, 50, 50);
        f.add(b7);
        JButton b8 = new JButton("8");
        b8.setBounds(70, 130, 50, 50);
        f.add(b8);
        JButton b9 = new JButton("9");
        b9.setBounds(130, 130, 50, 50);
        f.add(b9);
        JButton b0 = new JButton("0");
        b0.setBounds(70, 190, 50, 50);
        f.add(b0);
        

        f.setVisible(true);
        f.setSize(1000, 1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
