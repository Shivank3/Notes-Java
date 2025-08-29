import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // for string can use scanner.next()
        // read the name without space so that's why use nextLine
        //c.nextLine(); // whole line with space
        // string
        System.out.print("Enter Your Name: ");
        String str = scanner.nextLine();

        // int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        // double
        System.out.print("Enter your CGPA: ");
        double cgpa = scanner.nextDouble();
        // char not directly but by using string
        System.out.print("Enter a word: ");
        char letter = scanner.next().charAt(0);

        // boolean
        System.out.print("is tajMahal in agra(true/false): ");
        boolean isTajMahal = scanner.nextBoolean();

       // print output
        System.out.println("My Name is " + str);
        System.out.println(("I am " + age + " years old"));
        System.out.println("My cgpa in 2nd sem is " + cgpa);
        System.out.println("tajMahal is " + letter);
        if(isTajMahal){
            System.out.println("Yes tajMahal in agra");
        }
        else{
            System.out.println("No tajMahal in agra");
        }

         scanner.close();
    }
}

// System.in is used to read user input from console.
// Scanner class is a utility that simplifies reading input from user.
// Scanner supports multiple methods to read different data types (nextInt, nextDouble, nextLine, etc.).

