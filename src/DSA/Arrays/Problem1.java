package DSA.Arrays;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args){
        // Remove Even Integers From Array
        // example input - 1,3,-2,4,7
        // output - 1,3,7
        int[] arr = {0,1,2,3,5,7,8};
        int[] result = removeEven(arr);
        System.out.println(("Odd integers: " + Arrays.toString(result)));
    }

    public static int[] removeEven(int[] arr) {
        int count = 0; //  create a fixed array for storing odd elements
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            } // T.C- O(n)
            // total count of odds will be counted here
        }

         // create a new array which is equal to the total count
         int[] odds = new int[count];
         int result = 0;

        for (int i : arr) {
            if (i % 2 != 0) {
                odds[result++] = i;
            }
        }
        return odds;
    }
}
// T.c- O(n)+O(n) = O(n)
// o(n) -> space complexity-> line 24 new array it take space n

/*
     public static void main(String[] args){
        int[] arr = {1,3,5,7};
        List<Integer> result = removeEven(arr);
        System.out.println(result);
    }

    public static List<Integer> removeEven(int[] arr){
        List<Integer> oddsList = new ArrayList<>();
        for(int num : arr){
            if(num %2 != 0){
                oddsList.add(num);
            }
        }
          return oddsList;
    }

    time and space complexity is O(n) space-> worst all odd O(n) best-> all even O(1)

 */

