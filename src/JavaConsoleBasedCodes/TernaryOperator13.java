package JavaConsoleBasedCodes;

public class TernaryOperator13 {
    public static void main(String[] args)
    {
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

         int hours = 13;

        String time = (hours < 12) ? "A.M" : "P.M";
        System.out.println(time);

        int income = 200000;
        double taxRate = (income>500000) ? 0.5 : 0.25;
        System.out.println(taxRate);
    }
}
