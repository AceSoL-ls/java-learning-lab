import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  {

    JButton button;

    public MyFrame() throws HeadlessException {

        ImageIcon icon = new ImageIcon("Emoji.png");

        button = new JButton();
        button.setBounds(200, 100, 250, 100);
        // Lamda expression practise instead of tradition beginner way!
        button.addActionListener(e -> System.out.println("Yo thats a lamda expression!"));
        button.setText("This is a button");
        button.setFocusable(false);
        button.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }
    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Bro thats craaz");
        } */


}
