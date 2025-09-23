package DSA.FundamentalPrograms;

public class Program6 {
    public static void main(String[] args){
        int n = 9;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
