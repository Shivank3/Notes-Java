package Codes;
import java.util.Scanner;

public class BankingProgram17
{
    // banking program
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            System.out.println("********************");
            System.out.println("--Banking Program--");
            System.out.println("********************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");

            // getter and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= balance - withDraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid");
            }
        }
        System.out.println("********************");
        System.out.println("Thank you! have a nice day");
        System.out.println("********************");
        scanner.close();
    }

    // show balance
    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }
    // deposit
    static double deposit() {
        double amount;
        System.out.print("Enter your deposit amount: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    // withdraw
    static double withDraw(double balance){
        double withdrawAmount;
        System.out.print("Enter the amount to withdrawn:");
        withdrawAmount = scanner.nextDouble();
        if(balance < withdrawAmount)
        {
            System.out.println("insufficient amount");
            return 0;
        }
        else if(withdrawAmount < 0){
            System.out.println("Amount can't be negative");
        }
        else{
            return withdrawAmount;
        }
        return 0;
    }
}
