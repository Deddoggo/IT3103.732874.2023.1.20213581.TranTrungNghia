package Lab01;//Example 5: Lab01.Calc.java
// Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
import java.util.*;
import java.text.DecimalFormat;
public class Calc{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        while(b == 0){
            System.out.println("Invalid b! Re-enter b:");
            b = sc.nextDouble();
        }
        System.out.println("Sum: "+ (a+b));
        System.out.println("Difference: " +(a-b));
        System.out.println("Product: " + (a*b));
        System.out.println("Quotient: "+ df.format(a/b));
    }
}