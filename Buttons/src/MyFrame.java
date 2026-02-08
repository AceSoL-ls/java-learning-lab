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
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.GREEN);
        button.setBackground(Color.DARK_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); // If you want to make it unclickable


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 600);
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
