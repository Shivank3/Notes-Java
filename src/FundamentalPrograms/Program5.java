package FundamentalPrograms;

public class Program5 {
    public static void main(String[] args){
        // Sum of digits of a number
        // 1234 = 1+2+3+4 = 10
        int num =  -342343;
        int digit;
        int sum = 0;

        // edge cases for 00 / -134
        num = Math.abs(num);
        if(num == 0){
            sum = 0;
        }
        while(num > 0){
            digit = num % 10; // 2355/10 = 5
            sum += digit;
            num = num / 10; // 235
        }
        System.out.println(sum);
    }
}
