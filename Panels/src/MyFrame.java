import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    ImageIcon icon = new ImageIcon("Emoji.png");

    JLabel label = new JLabel();

    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JPanel greenPanel = new JPanel();

    MyFrame(){

        label.setText("Cool Text Bro!");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(50, 120, 90, 120);

        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0, 250, 250);
        redPanel.setLayout(null);

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500 ,250);
        greenPanel.setLayout(null);

        this.setTitle("My New Panel!");
        this.setSize(750,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Custom Layout is ON
        this.setVisible(true);

        this.add(label);

        bluePanel.add(label);
        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
    }
}
