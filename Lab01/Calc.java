package Lab01; // Package declaration
// Import necessary classes for input and formatting.
import java.util.*;
import java.text.DecimalFormat;
public class Calc { // Class declaration
    public static void main(String[] args) { // Main method
        // Create a DecimalFormat object for formatting the quotient.
        DecimalFormat df = new DecimalFormat("#.##");
        // Create a Scanner object to read user input from the console.
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter two numbers.
        System.out.println("Enter a & b:");
        // Read the user's input for 'a' and 'b'.
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        // Check if 'b' is zero (division by zero).
        while (b == 0) {
            // If 'b' is zero, prompt the user to re-enter 'b'.
            System.out.println("Invalid b! Re-enter b:");
            b = sc.nextDouble();
        }
        // Calculate and display the sum of 'a' and 'b'.
        System.out.println("Sum: " + (a + b));

        // Calculate and display the difference between 'a' and 'b'.
        System.out.println("Difference: " + (a - b));

        // Calculate and display the product of 'a' and 'b'.
        System.out.println("Product: " + (a * b));

        // Calculate and display the quotient of 'a' and 'b' with two decimal places.
        System.out.println("Quotient: " + df.format(a / b));
    }
}
