package Lab01;
import javax.swing.*;
public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change the first-class ticket?",
                "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: Yes");
        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You've chosen: No");
        } else if (option == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        } else if (option == JOptionPane.CLOSED_OPTION) {
            System.exit(0);
        }

        System.exit(0);
    }
}
