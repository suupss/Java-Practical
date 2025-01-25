package Section_two.six;
import javax.swing.*;
import java.awt.event.*;

public class HelloByeMessage {
    public static void main(String[] args) {
      
        JFrame frame = new JFrame("Hello and Bye Message");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 100);

        JLabel messageLabel = new JLabel("");
        messageLabel.setBounds(50, 180, 300, 30);

        JButton dummyButton = new JButton("Click Me");
        dummyButton.setBounds(150, 200, 100, 30);

       
        textArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
               
                messageLabel.setText("Hello");
            }

            @Override
            public void focusLost(FocusEvent e) {
             
                messageLabel.setText("Bye");
            }
        });

    
        frame.add(textArea);
        frame.add(messageLabel);
        frame.add(dummyButton);  
        frame.setVisible(true);
    }
}
