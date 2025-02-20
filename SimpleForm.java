import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3)); // 2 rows, 3 columns

        // Create a label and text field for the name
        JLabel nameLabel = new JLabel("Enter your name :");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 18));

        
        JLabel ageJLabel = new JLabel("Enter your ages :");
        ageJLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        ageJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField ageField = new JTextField();
        ageField.setFont(new Font("Arial", Font.PLAIN, 18));

        // Create a button to submit the form
        JButton submitButton = new JButton("Submit");
        submitButton.setHorizontalAlignment(SwingConstants.CENTER);
        submitButton.setLocation(100, 100);
        submitButton.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create a label to display the greeting message
        JLabel greetingLabel = new JLabel("");

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageJLabel);
        panel.add(ageField);
        panel.add(submitButton);
        panel.add(new JLabel("")); // Empty cell for layout purposes
        panel.add(new JLabel("")); // Another empty cell for layout purposes
        panel.add(greetingLabel);

        // Add an action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                greetingLabel.setText("Hello, " + name + " you ages is " + age);
            }
        });

        // Add the panel to the frame
        frame.add(panel);
        // Set the frame to be visible
        frame.setVisible(true);
    }
}
