package JavaConsoleBasedCodes;

public class StudentDiscountPrice8 {
    public static void main(String[] args)
    {
        // nested if else statements
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent)
        {
            if(isSenior){
                System.out.println("you will get senior discount of 20% ");
                System.out.println("you will get student discount of 10% ");
                price *= 0.5;
            }
        }
        else{
            if(isSenior){
                System.out.println("you will get senior discount of 20% ");
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

        System.out.printf("The price of a ticket is: $%.2f", price);
    }
}
