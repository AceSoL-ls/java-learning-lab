import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JPanel panel = new JPanel();
    JButton button = new JButton();

    public MyFrame() throws HeadlessException {
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.lightGray);

        this.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.setSize(250,300);
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.DARK_GRAY);
        panel.setOpaque(true);

        //----- Buttons Here ------//
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));

        this.add(button);
        this.add(panel);
        this.setVisible(true);
    }
}

