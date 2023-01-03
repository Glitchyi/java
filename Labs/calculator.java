package Labs;
// import statements  
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;

public class calculator implements ActionListener { 
    JFrame frameObj;
    JButton btnadd, btnmin, btndiv, btnmult, btneq, clear; //function buttons
    int fin=0; boolean init = true;                         //control flow vars
    JTextField txt = new JTextField();
    calculator() {                                          //constructor
        frameObj = new JFrame();
        JPanel p1 = new JPanel();
        Vector<JButton> list= new Vector<JButton>();       //Vector for numerical buttons
        for (int i = 0; i < 10; i++) {
            list.add(new JButton(""+i));
        }
        JButton btnmult = new JButton("x");
        JButton btnmin = new JButton("-");
        JButton btnadd = new JButton("+");
        JButton btndiv = new JButton("/");
        JButton btneq = new JButton("=");
        JButton clear = new JButton("cls");
        txt.setFont(new Font("serif", Font.PLAIN, 100));
        p1.add(list.elementAt(7));  p1.add(list.elementAt(8));  p1.add(list.elementAt(9));p1.add(btnadd);
        p1.add(list.elementAt(4));  p1.add(list.elementAt(5));  p1.add(list.elementAt(6));p1.add(btnmult);
        p1.add(list.elementAt(1));  p1.add(list.elementAt(2));  p1.add(list.elementAt(3));p1.add(btnmin);
        p1.add(list.elementAt(0));  p1.add(clear);p1.add(btneq);      p1.add(btndiv);
        for (int i = 0; i < 10; i++) {
            list.elementAt(i).addActionListener(this);
            list.elementAt(i).setFont(new Font("serif", Font.BOLD, 25));
        }
        btnadd.addActionListener(this);
        btnmin.addActionListener(this);
        btnmult.addActionListener(this);
        btndiv.addActionListener(this);
        clear.addActionListener(this);
        btneq.addActionListener(this);
        frameObj.add(txt);
        frameObj.add(p1);
        frameObj.setLayout(new GridLayout(2, 1));
        p1.setLayout(new GridLayout(4, 4));
        frameObj.setSize(300, 600);
        frameObj.setVisible(true);
    }
    public void op(String x){
        switch(x.charAt(0)){
            case '+': fin+=Integer.parseInt(x.substring(1));break;
            case '-': fin-=Integer.parseInt(x.substring(1));break;
            case '/': fin/=Integer.parseInt(x.substring(1));break;
            case 'x': fin*=Integer.parseInt(x.substring(1));break;
            default: break;
        }
    }
    public void actionPerformed(ActionEvent e) {
        while (true) {
            if ( e.getActionCommand() == "cls"){
                txt.setText(null);
                fin=0; init= true;
            }else if ( e.getActionCommand() == "=" ){
                op(txt.getText());
                txt.setText(null);
                txt.setText(""+fin);
                fin=0; init= true;
            }else if (e.getActionCommand() == "+" || e.getActionCommand() == "/" || e.getActionCommand() == "-" || e.getActionCommand() == "x") {
                String x = new String(txt.getText());
                if(init){
                    fin=Integer.parseInt(x);
                    init = false;
                }else{
                    op(x);
                }
                txt.setText(e.getActionCommand());
            } else {
                txt.setText(txt.getText() + e.getActionCommand() + "");
            }
            break;
        }
    }

    // main method
    public static void main(String argvs[]) {
        new calculator();
    }
}