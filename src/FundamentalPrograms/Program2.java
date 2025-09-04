package FundamentalPrograms;

public class Program2 {
    public static void main(String[] args){
        // multiplication table of a number
        int num = 5;
        int multiply;
        for(int i=1; i<=10; i++){
            multiply = num * i;
            System.out.println( num + " * " + i + " = " + multiply);
        }
    }
}
