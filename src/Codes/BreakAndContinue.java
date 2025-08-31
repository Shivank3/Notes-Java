package Codes;

public class BreakAndContinue {
    public static void main(String[] args){
        for(int i=0; i<10; i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println(i + " ");
        }
    }
}

// continue statement is used to skip the initialization and return back to starting of the loop
// break statement is used to break out the loop and exits the program
