package JavaConsoleBasedCodes;
import java.util.Scanner;

public class hypotenuseMaths2 {
    public static void main(String[] args)
    {
        // hypotenuse c= Math.sqrt(a² + b²) ² for this type window+r then write charmap

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("hypotenuse is: " + c + "cm");

        scanner.close();
    }
}
