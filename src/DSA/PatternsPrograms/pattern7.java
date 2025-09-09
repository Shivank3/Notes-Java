package DSA.PatternsPrograms;

public class pattern7 {
    public static void main(String[] args){
        int n=3;
        pattern7(n);
    }
    static void pattern7(int n){
        for(int i=0; i<n; i++){
            // for space printing
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // printing * after space
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            // print space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
