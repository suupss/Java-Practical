package Section_two.two;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterestCalculator {
    private JTextField principalField, rateField, timeField, resultField;

    public SimpleInterestCalculator() {
       
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));
        frame.setLocationRelativeTo(null);

        
        JLabel principalLabel = new JLabel("Principal (P):");
        principalField = new JTextField(10);

        JLabel rateLabel = new JLabel("Rate (R):");
        rateField = new JTextField(10);

        JLabel timeLabel = new JLabel("Time (T):");
        timeField = new JTextField(10);

        JLabel resultLabel = new JLabel("Simple Interest:");
        resultField = new JTextField(10);
        resultField.setEditable(false);  

     
        JButton calculateButton = new JButton("Calculate");

      
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateInterest();
            }
        });

 
        frame.add(principalLabel);
        frame.add(principalField);
        frame.add(rateLabel);
        frame.add(rateField);
        frame.add(timeLabel);
        frame.add(timeField);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(new JLabel(""));  
        frame.add(calculateButton);

  
        ((JPanel)frame.getContentPane()).setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.setVisible(true);
    }

    private void calculateInterest() {
        try {
            
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());

            // Calculate simple interest
            double interest = (principal * rate * time) / 100;

            // Display result
            resultField.setText(String.format("%.2f", interest));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, 
                "Please enter valid numbers in all fields.",
                "Input Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(() -> new SimpleInterestCalculator());
    }
}