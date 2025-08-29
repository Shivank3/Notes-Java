package Codes;
import java.util.Scanner;

// shopping cart program
public class code2 {

    public static void main(String[] args)
    {
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("what is the price of each?: ");
        double price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        int quantity = scanner.nextInt();

        total = price * quantity;

        // output
        System.out.println("you have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + "$" + total);

        scanner.close(); // prevents memory leaks
    }

}

