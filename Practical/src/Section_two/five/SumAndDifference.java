package Section_two.five;
import javax.swing.*;
import java.awt.event.*;

public class SumAndDifference {
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Sum and Difference Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

       
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        textField1.setBounds(50, 30, 120, 30);
        textField2.setBounds(200, 30, 120, 30);

        
        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 80, 300, 30);

       
        frame.add(textField1);
        frame.add(textField2);
        frame.add(resultLabel);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: Sum = " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int difference = num1 - num2;
                    resultLabel.setText("Result: Difference = " + difference);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });

        
        frame.setVisible(true);
    }
}
