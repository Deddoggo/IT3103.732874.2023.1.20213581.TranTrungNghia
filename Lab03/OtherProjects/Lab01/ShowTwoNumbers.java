package Lab01;
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        // Declare variables to store the input and the notification message.
        String strNum1, strNum2;
        String strNotification = "You've just entered: ";

        // Prompt the user to input the first number using a dialog box.
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number", "Input the first number:", JOptionPane.INFORMATION_MESSAGE);

        // Add the first number to the notification message.
        strNotification += strNum1 + " and ";

        // Prompt the user to input the second number using a dialog box.
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number", "Input the second number:", JOptionPane.INFORMATION_MESSAGE);

        // Add the second number to the notification message.
        strNotification += strNum2;

        // Display a dialog box with the composed notification message.
        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);

        // Terminate the program with exit code 0.
        System.exit(0);
    }
}
