import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame  {

    JLabel label = new JLabel();
    ImageIcon image = new ImageIcon("coder.jpg");

    MyFrame(){
        this.setTitle("Hey whats up world!");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setText("I like coding a lot");
        label.setIcon(image);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0x00FF00));
        label.setBackground(Color.magenta);
        label.setOpaque(true);
        label.setFont(new Font("MV Boli",Font.PLAIN,24));

        this.add(label);
        this.setVisible(true);
    }
}
