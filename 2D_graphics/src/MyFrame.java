import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JPanel panel = new MyPanel();

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(panel);
        this.pack();
    }

}
