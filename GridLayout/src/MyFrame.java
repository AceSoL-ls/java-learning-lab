import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JPanel panel = new JPanel();

    public MyFrame(){
        this.setSize(500,500);
        this.setLayout(new GridLayout(3,3));

        panel.setPreferredSize(new Dimension(250,250));
        

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        this.add(panel);
        this.setVisible(true);
    }
}
