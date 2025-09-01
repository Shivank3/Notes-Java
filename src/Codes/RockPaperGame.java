    package Codes;

    import java.util.Random;
    import java.util.Scanner;

    public class RockPaperGame {
        public static void main(String[] args){
            // Rock paper scissors game
            // declare variables of choices-> playerChoice,computerChoice
            // take input of choices from the user
            // take input from computer choice
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            String[] choices = {"Rock", "Paper", "Scissors"};
            String playerChoice;
            String computerChoice;
            String playAgain = "Yes";

            do{
                System.out.print("Enter you move (rock, paper, scissors): ");
                playerChoice = scanner.nextLine().toLowerCase();
                if(!playerChoice.equals("rock") &&
                        !playerChoice.equals("paper") &&
                        !playerChoice.equals("scissors"))
                {
                    System.out.println("invalid choice");
                    continue;
                }
                computerChoice = choices[random.nextInt(3)].toLowerCase();
                System.out.println("Computer choice: " + computerChoice);

                if(playerChoice.equals(computerChoice)){
                    System.out.println("It's a tie");
                }
                else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        playerChoice.equals("scissors") && computerChoice.equals("paper")){
                    System.out.println("You win!");
                }
                else{
                    System.out.println("You lose");
                }
                System.out.print("Play again (yes/no): ");
                playAgain = scanner.nextLine().toLowerCase();
            }while(playAgain.equals("yes"));

            System.out.println("Thanks for playing");
            scanner.close();
        }
    }
