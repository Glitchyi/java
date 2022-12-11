import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swinf {
  public static void main(String[] args) {
    // Create a new JFrame to hold the calculator's GUI
    JFrame frame = new JFrame("Calculator");

    // Set the frame to exit the program when it is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a new instance of the CalculatorPanel class, which will
    // create and lay out the buttons and text field for the calculator
    CalculatorPanel panel = new CalculatorPanel();

    // Add the panel to the frame as the main content pane
    frame.setContentPane(panel);

    // Set the size of the frame and show it on the screen
    frame.pack();
    frame.setVisible(true);
  }
}

class CalculatorPanel extends JPanel {
  // Create the text field where the user can enter numbers and see the result
  private JTextField textField = new JTextField(20);

  // Create the buttons for the calculator
  private JButton button0 = new JButton("0");
  private JButton button1 = new JButton("1");
  private JButton button2 = new JButton("2");
  private JButton button3 = new JButton("3");
  private JButton button4 = new JButton("4");
  private JButton button5 = new JButton("5");
  private JButton button6 = new JButton("6");
  private JButton button7 = new JButton("7");
  private JButton button8 = new JButton("8");
  private JButton button9 = new JButton("9");
  private JButton buttonDot = new JButton(".");
  private JButton buttonEqual = new JButton("=");
  private JButton buttonPlus = new JButton("+");
  private JButton buttonMinus = new JButton("-");
  private JButton buttonTimes = new JButton("*");
  private JButton buttonDivide = new JButton("/");
  private JButton buttonClear = new JButton("Clear");

  // Create a variable to keep track of the current operation being performed
  private String currentOperation = "=";

  // Create a variable to store the result of the previous operation
  private double result = 0;

  public CalculatorPanel() {
    // Set the layout manager for the panel to a GridLayout with 4 rows and 4 columns
    setLayout(new GridLayout(4, 4));

    // Add the text field and the buttons to the panel
    add(textField);
    add(button1);
    add(button2);
    add(button3);
    add(button4);
    add(button5);
    add(button6);
    add(button7);
    add(button8);
    add(button9);
    add(button0);
    add(buttonDot);
    add(buttonEqual);
    add(buttonPlus);
    add(buttonMinus);
    add(buttonTimes);
    add(buttonDivide);
    add(buttonClear);
  }

}