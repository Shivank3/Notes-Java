package FundamentalPrograms;

public class Program4 {
    public static void main(String[] args) {
        // count digits in a number -> 6789 which is 4
        int number = -000;
        int count = 0;

        // int does not hold each multiple 0's so whether it's 4->0000 -> count as 1
        // edge cases
        if (number == 0) {
            count = 1;
        } else {
            number = Math.abs(number);
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }
        System.out.println("Count of given number: " + count);
    }
}
