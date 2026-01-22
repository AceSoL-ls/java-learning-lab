import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    ImageIcon image = new ImageIcon();

    JLabel label = new JLabel();

    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JPanel greenPanel = new JPanel();

    MyFrame(){

        label.setText("Cool Text Bro!");

        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0, 250, 250);

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500 ,250);

        this.setTitle("My New Panel!");
        this.setSize(750,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // Custom Layout is ON
        this.setVisible(true);

        this.add(label);

        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
    }
}
