package Section_two.three;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;


public class NumberMultiplier {
    private JTextField number1Field, number2Field, resultField;

    public NumberMultiplier() {
        
        JFrame frame = new JFrame("Number Multiplier");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel number1Label = new JLabel("First Number:");
        number1Field = new JTextField();
        
        JLabel number2Label = new JLabel("Second Number:");
        number2Field = new JTextField();
        
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);  

        number1Field.getDocument().addDocumentListener(new MyDocumentListener());
        number2Field.getDocument().addDocumentListener(new MyDocumentListener());
        frame.add(number1Label);
        frame.add(number1Field);
        frame.add(number2Label);
        frame.add(number2Field);
        frame.add(resultLabel);
        frame.add(resultField);

        ((JPanel)frame.getContentPane()).setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class MyDocumentListener implements DocumentListener {
        public void insertUpdate(DocumentEvent e) {
            updateResult();
        }
        public void removeUpdate(DocumentEvent e) {
            updateResult();
        }
        public void changedUpdate(DocumentEvent e) {
            updateResult();
        }
    }

    private void updateResult() {
        try {
            String text1 = number1Field.getText();
            String text2 = number2Field.getText();
            
            if (!text1.isEmpty() && !text2.isEmpty()) {
                double num1 = Double.parseDouble(text1);
                double num2 = Double.parseDouble(text2);
                double result = num1 * num2;
                resultField.setText(String.format("%.2f", result));
            } else {
                resultField.setText("");
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
         new NumberMultiplier();
    }
}