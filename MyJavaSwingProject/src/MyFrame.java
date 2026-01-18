import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    // UI component declarations
    private JButton button;
    private JTextField textField;

    // Initializes panel layout and UI components
    public MainPanel() {
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        add(textField);

        button = new JButton("Click me");
        add(button);

        button.addActionListener(e ->
                System.out.println(textField.getText()) // Print text to console on click
        );
    }
}
