import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("My App");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Add main application panel
        add(new MainPanel());

        setVisible(true);
    }
}
