package DSA.Arrays;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args){
        // Remove Even Integers From Array
        // example input - 1,3,-2,4,7
        // output - 1,3,7
        int[] arr = {0,1,2,3,5,7,8};
        int[] result = removeEven(arr);
        // return odd elements in array string format which is
        System.out.println(("Odd integers: " + Arrays.toString(result)));
    }

    public static int[] removeEven(int[] arr) {
        int count = 0;
        // count odd number in array
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            } // T.C- O(n)
        }

         // create a new array to store odd elements in odds
         int[] odds = new int[count];
         int result = 0; // array index

        // check each element and store odd
        for (int i : arr) {
            if (i % 2 != 0) {
                odds[result++] = i;
            }
        }
        return odds; // get odds values
    }
}
// T.c- O(n)+O(n) = O(n)
// o(n) -> space complexity-> line 23: new array take space n

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

// Approach-1
// input = mixed set of elements
// check odd ones - count so make a new array to store fixed size of odd ones
// create an odd size array to store odd elements
// return
