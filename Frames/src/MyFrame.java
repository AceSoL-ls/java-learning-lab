import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame { // Sub Class MyFrame inherits from Super Class JFrame

    MyFrame(){

        this.setTitle("JFrame tittle");
        this.setSize(500,500);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("windows.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.CYAN);
    }
}
