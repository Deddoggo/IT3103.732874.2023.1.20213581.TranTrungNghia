package Lab01;
import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        // Declare a variable to store the user's name.
        String result;

        // Display a dialog prompting the user to enter their name and store the input in the 'result' variable.
        result = JOptionPane.showInputDialog("Please enter your name: ");

        // Display a greeting message using the entered name.
        JOptionPane.showMessageDialog(null, "Hi " + result + " !");

        // Terminate the program with exit code 0.
        System.exit(0);
    }
}
