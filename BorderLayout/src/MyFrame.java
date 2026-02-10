import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JPanel panel = new JPanel();

    MyFrame(){
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.pack();
        this.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.WEST);
        this.add(panel3, BorderLayout.EAST);
        this.add(panel4, BorderLayout.SOUTH);
        this.add(panel5, BorderLayout.CENTER);
    }
}
