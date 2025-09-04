package JavaConsoleBasedCodes;
import java.util.Scanner;

public class CompoundInterest12 {
    public static void main(String[] args){

        // compound interest calculator
        Scanner scanner = new Scanner(System.in);
        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = scanner.nextDouble();

        System.out.print("Enter the # interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the # times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f", years, amount);
        scanner.close();
    }
}
