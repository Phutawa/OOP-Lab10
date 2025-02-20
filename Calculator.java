import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2)); // 2 rows, 3 columns

        // Create a label and text field for the name
        JLabel Int1Label = new JLabel("Enter First Integer Number :");
        Int1Label.setFont(new Font("Arial", Font.PLAIN, 20));
        Int1Label.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField Int1Field = new JTextField();
        Int1Field.setFont(new Font("Arial", Font.PLAIN, 18));

        
        JLabel Int2Label = new JLabel("Enter Second Integer Number :");
        Int2Label.setFont(new Font("Arial", Font.PLAIN, 20));
        Int2Label.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField Int2Field = new JTextField();
        Int2Field.setFont(new Font("Arial", Font.PLAIN, 18));

        JButton addButton = new JButton("Addition");
        addButton.setHorizontalAlignment(SwingConstants.CENTER);
        addButton.setLocation(100, 100);
        addButton.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create a button to submit the form
        JButton subButton = new JButton("Subtraction");
        subButton.setHorizontalAlignment(SwingConstants.CENTER);
        subButton.setLocation(100, 100);
        subButton.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create a label to display the greeting message
        JLabel greetingLabel = new JLabel("");

        // Add components to the pane
        panel.add(Int1Label);
        panel.add(Int1Field);
        panel.add(Int2Label);
        panel.add(Int2Field);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(new JLabel("")); // Empty cell for layout purposes
        panel.add(new JLabel("")); // Another empty cell for layout purposes
        panel.add(greetingLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(Int1Field.getText());
                int num2 = Integer.parseInt(Int2Field.getText());
                int Result = num1 + num2;
                greetingLabel.setText("Result is : " + Result);
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(Int1Field.getText());
                int num2 = Integer.parseInt(Int2Field.getText());
                int Result = num1 - num2;
                greetingLabel.setText("Result is : " + Result);
            }
        });
        // Add the panel to the frame
        frame.add(panel);
        // Set the frame to be visible
        frame.setVisible(true);
    }
}
