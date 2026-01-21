import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame  {

    JLabel label = new JLabel();
    ImageIcon image = new ImageIcon("coder.jpg");
    Border border = BorderFactory.createLineBorder(new Color(0x00FF00), 10);

    MyFrame(){
        this.setTitle("Hey whats up world!");
        //this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setText("I like coding a lot");
        label.setIcon(image);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        //label.setBounds(100, 70, 320, 320); // change the size and position of label
        label.setForeground(new Color(0x00FF00));
        label.setIconTextGap(-35);
        label.setBackground(Color.magenta);
        label.setOpaque(true); // make background color paint appear
        label.setBorder(border);

        label.setFont(new Font("MV Boli",Font.PLAIN,24));

        //this.setLayout(null); // custom Layout is ON (null)
        this.add(label);
        this.setVisible(true);
        this.pack(); // this method will make the frame adjust to window size real-time!
    }
}
