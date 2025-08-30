package Codes;
import java.util.Scanner;
public class subStrings10 {
    public static void main(String[] args)
    {
        // substring -> a method is used to extract a portion of a string
        //              .subString(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@"));
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Email must contain @ ");
        }
        scanner.close();
    }
}

