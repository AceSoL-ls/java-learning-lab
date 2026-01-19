import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame  {

    JLabel label = new JLabel();
    ImageIcon image = new ImageIcon("addict.jpg");

    MyFrame(){
        this.setTitle("Hey whats up world!");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        label.setText("I like coding a lot");
        label.setIcon(image);
        label.setBounds(150,200,200,30);
        label.setForeground(new Color(0x00FF00));
        label.setBackground(Color.magenta);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));

        this.add(label);
        this.setVisible(true);
    }
}
