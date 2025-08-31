package Codes;
import java.util.Random;

public class randomGenerator6 {
    public static void main(String[] args)
    {
        Random random = new Random();

        int num1;
        int num2;
        double num3;
        boolean isHead;

        num1 = random.nextInt(1,50);
        num2 = random.nextInt(1,50);
        num3 = random.nextDouble(1,50);
        isHead = random.nextBoolean();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(isHead);
        if(isHead){
            System.out.println("Head");
        }
        else{
            System.out.println("Tail");
        }
    }
}


