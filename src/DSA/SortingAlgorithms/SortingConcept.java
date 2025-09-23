package DSA.SortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class SortingConcept {
    public static void main(String[] args){
        Integer[] arr  = { 10,5,4,3,2,1 }; // default sorting will be in increasing order
        System.out.println("Before sorting the array is: " + Arrays.toString(arr));
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("After sorting the array is: "+ Arrays.toString(arr));
        System.out.println("reverse the sorting the array is: "+ Arrays.toString(arr));
    }
}
