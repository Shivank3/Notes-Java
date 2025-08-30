package Codes;
import java.util.Scanner;

public class WeightConversion11 {
    static void main(String[] args)
    {
        // weight conversion program
        Scanner scanner = new Scanner(System.in);

        double weight;
        double netWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kgs"); // option 1
        System.out.println("2: Convert kgs to lbs"); // option 2

        System.out.print("Choose an option: ");
        choice = scanner.nextInt(); // chose 1 or 2

        // option 1 convert lbs to kgs
        if(choice == 1){
            System.out.print("Enter the weight in lbs:");
            weight = scanner.nextDouble();
            netWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f" , netWeight);
        }
        // option 2 convert kgs to lbs
        else if(choice == 2)
        {
            System.out.print("Enter the weight in kgs:");
            weight = scanner.nextDouble();
            netWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", netWeight);
        }
        else{
            System.out.println("This was not a valid choice");
        }
        scanner.close();
    }
}
