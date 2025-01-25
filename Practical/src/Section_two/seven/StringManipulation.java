package Section_two.seven;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringManipulation {
    private JFrame frame;
    private JTextField inputField;
    private JLabel messageLabel;
    private JButton checkPalindromeButton;
    private JButton reverseButton;
    private JButton findVowelsButton;

    public StringManipulation() {
       
        frame = new JFrame("String Manipulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

    
        messageLabel = new JLabel("Input any String:");
        inputField = new JTextField(20);
        checkPalindromeButton = new JButton("Check Palindrome");
        reverseButton = new JButton("Reverse");
        findVowelsButton = new JButton("Find Vowels");

        
        frame.add(messageLabel);
        frame.add(inputField);
        frame.add(checkPalindromeButton);
        frame.add(reverseButton);
        frame.add(findVowelsButton);

       
        checkPalindromeButton.addActionListener(new CheckPalindromeAction());
        reverseButton.addActionListener(new ReverseAction());
        findVowelsButton.addActionListener(new FindVowelsAction());

     
        frame.setVisible(true);
    }

  
    private class CheckPalindromeAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String original = inputField.getText();
            String reverse = "";
            int length = original.length();
            for (int i = length - 1; i >= 0; i--) {
                reverse += original.charAt(i);
            }
            if (original.equals(reverse)) {
                JOptionPane.showMessageDialog(frame, original + " is a palindrome.");
            } else {
                JOptionPane.showMessageDialog(frame, original + " is not a palindrome.");
            }
        }
    }

    
    private class ReverseAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String original = inputField.getText();
            String reverse = "";
            int length = original.length();
            for (int i = length - 1; i >= 0; i--) {
                reverse += original.charAt(i);
            }
            inputField.setText(reverse);
            JOptionPane.showMessageDialog(frame, "Reversed string: " + reverse);
        }
    }

   
    private class FindVowelsAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String str = inputField.getText().toLowerCase();
            StringBuilder vowels = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels.append(c);
                }
            }
            JOptionPane.showMessageDialog(frame, "Vowels in the string: " + vowels.toString());
        }
    }

    public static void main(String[] args) {
        new StringManipulation();
    }
}

