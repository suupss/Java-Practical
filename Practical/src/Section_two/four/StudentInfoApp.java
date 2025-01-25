package Section_two.four;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInfoApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Info");
        frame.setLayout(new GridLayout(5, 2, 10, 10));
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JTextField fullNameField = new JTextField(20);
        JTextField rollNoField = new JTextField(10);
        JTextField facultyField = new JTextField(10);
        JTextField emailField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fullName = fullNameField.getText();
                String rollNo = rollNoField.getText();
                String faculty = facultyField.getText();
                String email = emailField.getText();

                if (fullName.isEmpty() || rollNo.isEmpty() || faculty.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Full Name: " + fullName + "\nRoll No: " + rollNo + "\nFaculty: " + faculty + "\nEmail: " + email);
                }
            }
        });

        frame.add(new JLabel("Full Name:"));
        frame.add(fullNameField);
        frame.add(new JLabel("Roll No:"));
        frame.add(rollNoField);
        frame.add(new JLabel("Faculty:"));
        frame.add(facultyField);
        frame.add(new JLabel("Email:"));
        frame.add(emailField);
        frame.add(new JLabel(""));
        frame.add(submitButton);

        frame.setVisible(true);
    }
}

