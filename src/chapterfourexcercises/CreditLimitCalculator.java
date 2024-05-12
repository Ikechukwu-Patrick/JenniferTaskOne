package chapterfourexcercises;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter balance at the beginning of the month");
        double balanceAtTheBeginningOfTheMonth = scanner.nextDouble();

        System.out.println("Enter total of all items charged by the customer this month");
        double totalCharges = scanner.nextDouble();

        System.out.println("Enter the total of all credits applied to the customer's account");
        double creditAppliedToCustomer = scanner.nextDouble();

        System.out.println("Enter allowed credit limit");
        double allowedCreditLimit = scanner.nextDouble();

        double newBalance = balanceAtTheBeginningOfTheMonth + totalCharges - creditAppliedToCustomer;

        System.out.println(newBalance > allowedCreditLimit ? "Warning: Credit limit exceeded" : "Credit limit not exceeded");



    }
}
