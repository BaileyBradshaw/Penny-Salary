import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dollarFormat = new DecimalFormat("$0.00");

        int daysWorked;
        double totalPay = 0.0;
        
        // the number of days worked is at least 1.
        do {
            System.out.print("Enter the number of days worked (must be >= 1): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a positive integer: ");
                scanner.next();
            }
            daysWorked = scanner.nextInt();
        } while (daysWorked < 1);

        for (int day = 1; day <= daysWorked; day++) {
            double salary = Math.pow(2, day - 1) / 100.0; // Convert pennies to dollars
            totalPay += salary;
            System.out.println("Day " + day + ": " + dollarFormat.format(salary));
        }

        System.out.println("Total Earnings: " + dollarFormat.format(totalPay));
        
        scanner.close();
    }
}