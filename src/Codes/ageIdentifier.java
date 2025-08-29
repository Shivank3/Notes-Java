package Codes;
import java.util.Scanner;
// Age-identifier -> define age and return based on their type
public class ageIdentifier {
    static void main(String[] args)
    {
        double age;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age?: ");
        age = scanner.nextDouble();

        // use if-else-if-else statements
        if(age <= 0) {
            System.out.println("you are not born ");
        }
        else if(age < 13)
        {
            System.out.println("You are a child");
        }
        else if(age > 13 && age <= 18)
        {
            System.out.println("you are a teen");
        }
        else if(age > 18 && age < 65)
        {
            System.out.println("you are an Adult");
        }
        else if(age > 65){
            System.out.println("you are an senior citizen ");
        }
        else
        {
            System.out.println("invalid");
        }
        scanner.close();
    }
}
