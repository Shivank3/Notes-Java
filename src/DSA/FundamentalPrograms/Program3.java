package DSA.FundamentalPrograms;

public class Program3 {
    public static void main(String[] args) {
        // reverse a number -> 4321 -> 1234
        int num = 4321;
        int result = reverseNum(num);
        System.out.println(result);
    }

    private static int reverseNum(int num) {
        int y = 0; // 1 -> 12 -> 123 ->
        int digit;

        while(num > 0){
            digit = num % 10; // 4321%10 = 1 reminder digit -> 12
            y = y * 10 + digit; // y = 3*10+2 = 123*10+4  1234
            num = num / 10; // 4321/10 = 43
        }
        return y;
    }
}