import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    NewWindow(){

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setText("Hello this is my first swing Window Page. So far im able to do" +
                "all this on my own. Youtube tutorials make it seem easy but with no practise" +
                "i would not be able to make it so far.The connection i have with coding " +
                "is something stronger than i expected.My ideas can be easily come to life" +
                "through a computer's rendering abilities.Im so grateful to be able to do" +
                "all that while im healthy, young and hungry for knowledge.My hope is to" +
                "continue in tech as much as i can, advance in this professional career" +
                "and create, fix, evolve, automate applications as much as possible" +
                "for our future evolution. -Euripides Laliotis. "); 

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

    }
}
