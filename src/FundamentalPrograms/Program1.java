package FundamentalPrograms;

public class Program1 {
    public static void main(String[] args) {
        // sum of first 5 natural numbers -> 1+2+3+4+5 = 15
        // input n = 5
        int n = 5;
        int result = sumOfNatural(n);
        System.out.println(result);
    }
     private static int sumOfNatural(int n){

            int sum = 0;
            for(int i=1; i<=n; i++){
                sum += i;
            }
            return sum;
        }
}
