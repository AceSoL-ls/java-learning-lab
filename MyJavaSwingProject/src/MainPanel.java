import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    JButton button;
    JTextField textField;

    MainPanel() {
        setLayout(new FlowLayout());

        button = new JButton("Click me!");
        add(button);

        textField = new JTextField(15);
        add(textField);

    }
}
