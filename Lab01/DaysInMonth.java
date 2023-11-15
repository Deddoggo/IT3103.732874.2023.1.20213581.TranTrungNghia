package Lab01;
import java.util.Scanner;
    public class DaysInMonth {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int year, month;
            int daysInMonth = 0;
            while (true) {
                System.out.print("Enter a year (e.g., 2023): ");
                year = scanner.nextInt();
                System.out.print("Enter a month (1-12): ");
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    break;
                } else {
                    System.out.println("Invalid month. Please enter a month between 1 and 12.");
                }
            }
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
            }
            System.out.println("There are " + daysInMonth + " days in month " + month + " of year " + year + ".");
            scanner.close();
        }
    }
