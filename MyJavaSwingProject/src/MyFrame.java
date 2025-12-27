import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {
        setTitle("MyApp");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new MainPanel());

        setVisible(true);

    }
}
