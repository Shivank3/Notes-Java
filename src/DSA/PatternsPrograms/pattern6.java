package DSA.PatternsPrograms;

public class pattern6 {
    public static void main(String[] args){
        int n = 5;
        pattern6(n);
    }
    static void pattern6(int n){
        for(int i=0; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
