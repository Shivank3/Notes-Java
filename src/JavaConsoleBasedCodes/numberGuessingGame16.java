package JavaConsoleBasedCodes;

import java.util.Random;
import java.util.Scanner;

// number guessing game
public class numberGuessingGame16 {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int randomNumber = random.nextInt(1,101);
        System.out.println("Number Guessing Game");
        System.out.println("Guess a Number between 1-10: ");

        do{
            System.out.print("Enter a guessing game: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess < randomNumber){
                System.out.println("Too Low! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("Too High! Try again");
            }
            else{
                System.out.println("Correct! The number was " + randomNumber + " " + "it takes " + attempts + " attempts!");
            }
        }while(guess != randomNumber);

        scanner.close();
    }
}

