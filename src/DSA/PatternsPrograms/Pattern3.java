package DSA.PatternsPrograms;

public class Pattern3 {
    public static void main(String[] args)
    {
        int N = 5;
        pattern3(N);
    }

    private static void pattern3(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
