package Lab01;
import java.util.*;
import java.text.DecimalFormat;
public class SolveEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        //the first equation ax+b== (a != 0)
//        System.out.println("Enter a of the equation(ax+b=0): ");
//        double a = sc.nextDouble();
//        while (a == 0){
//            System.out.println("a cant be 0! Re-enter:");
//            a = sc.nextDouble();
//        }
//        System.out.println("Enter b of the equation(ax+b=0): ");
//        double b = sc.nextDouble();
//        System.out.println("Result is: " + df.format(-b/a));
        //the second equation a11x1+a12x2=b1|a21x1+a22x2=b2
//        System.out.println("Enter elements of the equation:");
//        double a11 = sc.nextDouble();
//        double a12 = sc.nextDouble();
//        double b1 = sc.nextDouble();
//        double a21 = sc.nextDouble();
//        double a22 = sc.nextDouble();
//        double b2 = sc.nextDouble();
//        double D = a11 * a22 - a12 * a21;
//        double D1 = b1 * a22 - a12 * b2;
//        double D2 = b2 * a11 - a21 * b1;
//        if (D == D1 && D==D2 ) {
//            System.out.println("The system of equations has no unique solution.");
//        } else if (D!=0){
//            double x1 = (b1 * a22 - b2 * a12) / D;
//            double x2 = (a11 * b2 - a21 * b1) / D;
//
//            System.out.println("Solution:");
//            System.out.println("x1 = " + x1);
//            System.out.println("x2 = " + x2);
//        }
//        else{
//            System.out.println("The system of equations has no solution.");
//        }
        //the third equation ax^2+bx+c=0
        System.out.println("Enter a & b for equation(a!=0): ");
        double a = sc.nextDouble();
        while (a == 0){
            System.out.println("a cant be 0! Re-enter:");
            a = sc.nextDouble();
        }
        System.out.println("Enter b of the equation(ax+b=0): ");
        double b = sc.nextDouble();
        System.out.println("Enter c of the equation(ax+b=0): ");
        double c = sc.nextDouble();
        double delta = Math.pow(b,2)-(4*a*c);
        if(delta < 0){
            System.out.println("The system of equations has no solution.");
        }
        else if(delta == 0){
            System.out.println("The system of equations has 1 solution: "+ (-b/(2*a)));
        }
        else {
            System.out.println("The system of equations has 2 solution: x1= "+ ((-b-Math.sqrt(delta))/(2*a)) + " x2= "+ ((-b-Math.sqrt(delta))/(2*a)));
        }
    }
}
