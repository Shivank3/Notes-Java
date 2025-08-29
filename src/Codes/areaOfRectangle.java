package Codes;
// find the area of rectangle
// we need to calculate area? -> length*breadth
import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args)
    {
        double area = 0;
        double length = 0;
        double height = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = length * height;

        System.out.println("The area of rectangle is: " + area + "cm");

        scanner.close();
    }
}
