import javax.swing.*;

public class MyFrame extends JFrame {

    JLayeredPane layeredPane = new JLayeredPane();


    public MyFrame(){
        this.setTitle("Crazy app");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        layeredPane.setBounds(0,0,500,500);



        this.add(layeredPane);
        this.setVisible(true);
    }
}
