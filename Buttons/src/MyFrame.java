import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    public MyFrame() throws HeadlessException {

        ImageIcon icon = new ImageIcon("Emoji.png");
        ImageIcon icon2 = new ImageIcon("ok-emoji.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        // Lamda expression practise instead of tradition beginner way!
        //button.addActionListener(e -> System.out.println("Yo thats a lamda expression!"));
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
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            //System.out.println("Bro thats craaz");
            label.setVisible(true);
        }
    }

}
