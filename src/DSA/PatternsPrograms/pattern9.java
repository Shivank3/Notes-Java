package DSA.PatternsPrograms;

public class pattern9 {
    public static void main(String[] args){
        int n=3;
        pattern9(n);
        Invertedpattern9(n);
    }
    // diamond star pattern
    static void pattern9(int n)
    {
        for(int i=0; i<n; i++){

            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++)
            {
                System.out.print("*");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Invertedpattern9(int n)
    {
        for(int i=0; i<n; i++)
        {
            // print star
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            // for print star
            for(int j=0; j<2*n-(2*i +1); j++)
            {
                System.out.print("*");
            }

            // for print space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
