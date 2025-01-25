package Section_two.one;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFoodOrder {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Food Ordering System");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create panel for food items
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Create checkboxes for food items
        JCheckBox burger = new JCheckBox("Burger - $5.00");
        JCheckBox pizza = new JCheckBox("Pizza - $8.00");
        JCheckBox fries = new JCheckBox("Fries - $3.00");
        
        // Create order button with smaller size
        JButton orderButton = new JButton("Order Now");
        orderButton.setPreferredSize(new Dimension(100, 30));
        
        // Create a panel for the button to center it
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(orderButton);
        
        // Add components to panel
        panel.add(burger);
        panel.add(pizza);
        panel.add(fries);
        panel.add(buttonPanel);
        
        // Add action listener to button
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                StringBuilder order = new StringBuilder("You ordered:\n");
                
                // Check selected items
                if (burger.isSelected()) {
                    order.append("Burger: $5.00\n");
                    total += 5.00;
                }
                if (pizza.isSelected()) {
                    order.append("Pizza: $8.00\n");
                    total += 8.00;
                }
                if (fries.isSelected()) {
                    order.append("Fries: $3.00\n");
                    total += 3.00;
                }
                
                // Show message if nothing is selected
                if (total == 0) {
                    JOptionPane.showMessageDialog(frame, 
                        "Please select at least one item!");
                } else {
                    // Show order summary
                    order.append("\nTotal Price: $").append(String.format("%.2f", total));
                    JOptionPane.showMessageDialog(frame, order.toString());
                }
            }
        });
        
        // Add panel to frame and display
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}