import java.util.*;

public class ScannerClass {
    public static void main(String[] args)
    {
        String s;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        // for string can use sc.next() read the name without space so that's why use nextLine
        s = sc.nextLine();

        System.out.println("Enter your age");
        age = sc.nextInt(); //

        //c.nextLine(); // whole line with space

        System.out.println("Name: " + s);
        System.out.println(("Age: " + age));
    }
}

// System.in is used to read user input from console.
// Scanner class is a utility that simplifies reading input from user.
// Scanner supports multiple methods to read different data types (nextInt, nextDouble, nextLine, etc.).

