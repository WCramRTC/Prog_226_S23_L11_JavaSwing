import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {

    private JPanel rootPanel;
    private JTextField txtNumber1;
    private JTextField txtNumber2;

    private JButton btnSum;
    private JTextArea taDisplay;

    public Form1() {

        // This is the button click event for our button Sum
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DoCalculation();
            }
        });
    } // Form1

    public void DoCalculation() {
        String userNumber1 = txtNumber1.getText();
        String userNumber2 = txtNumber2.getText();

        int number1 = Integer.parseInt(userNumber1);
        int number2 = Integer.parseInt(userNumber2);
        int sum = number1 + number2;

        // Your first number is "user number 1"
        // your second number is "number 2"
        // The sum is "sum"
        // The equation is number 1 + number 2 = sum

        taDisplay.setText("Your first number is " + userNumber1);
        // To add text, i need to Append
        taDisplay.append("\n"); // This is a new line
        taDisplay.append("Your second number is " + userNumber2);
        taDisplay.append("\n"); // This is a new line
        taDisplay.append("Your sum is " + sum);
        taDisplay.append("\n"); // This is a new line

        String formattedEquation = String.format("The equation is %s + %s = %s", number1, number2, sum);
        taDisplay.append(formattedEquation);
    }

// We create our main just to load the form.
    // But we create a constructor for the class, that we use to wire up all of our code
    public static void main(String[] args) {
        OpenFrame(); // Opens the frame
    } // main


    public static void OpenFrame() {
        // Create a new frame to open
        JFrame frame = new JFrame("Java Swing Application");

        // Set the content pane for the frame
        frame.setContentPane(new Form1().rootPanel);

        // Set the default closing option
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Package the frame
        frame.pack();

        // Set Visability to true
        frame.setVisible(true);

    }

//        // We have 5 things to implement to open our form
//        JFrame frame = new JFrame("Hello World - Swing"); // Create a new instance of JFrame
//        frame.setContentPane(new HelloWorld_Swing().rootPanel); // Pass the panel into the JFrame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the default close option
//        frame.pack(); // Pack the frame
//        frame.setVisible(true); // Set visible to true

}
