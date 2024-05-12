package chapterfourexcercises;

import java.util.Scanner;

    public class SalesCommissionCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter salesperson's name (optional): ");
            String salespersonName = scanner.nextLine();

            System.out.print("Enter total gross sales for the week (in dollars): ");
            double grossSales = scanner.nextDouble();

            double earnings = 200 + 0.09 * grossSales;


            System.out.println("\nSalesperson: " + salespersonName);
            System.out.printf("Earnings: $%.2f%n", earnings);
        }
    }

