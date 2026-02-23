import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String message = String.valueOf(JOptionPane.showOptionDialog(null,"Do you like coding?", "Message from the devs",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,null, null, 0));
        System.out.println(message);
    }
}