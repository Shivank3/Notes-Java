package JavaConsoleBasedCodes;

import java.util.Scanner;

public class QuizGame19 {
    public static void main(String[] args)
    {
        String[] questions = {"what is the capital of india?",
                              "what is the capital of USA?",
                              "what is the capital of Europe?",
                              "what is the capital of france?"};

        String[][] options = {{"1.Jaipur", "2.Delhi", "3.Mumbai", "4.Kolkata"},
                             {"1.New york", "2.california", "3.Texas", "4.Dallas"},
                             {"1.London", "2.italy", "3.paris", "4.ireland"},
                             {"1.New york", "2.paris", "3.sri lanka", "4.nigeria"}};
        int[] answers = {2,1,1,2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Welcome to the General knowledge Quiz!");
        System.out.println("--------------------------------------");

        for(int i=0; i<questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]){
                System.out.println("************");
                System.out.println("CORRECT!");
                System.out.println("************");
                score++;
            }
            else{
                System.out.println("************");
                System.out.println("WRONG Answer");
                System.out.println("************");
            }
            System.out.println("Your final score is: "+ score+ " out of "+ questions.length);
        }
        scanner.close();
    }
}

