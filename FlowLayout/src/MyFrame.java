import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JLabel label = new JLabel();
    JButton button = new JButton();

    public MyFrame() throws HeadlessException {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.lightGray);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        label.setSize(150,200);


        this.setVisible(true);
    }
}

