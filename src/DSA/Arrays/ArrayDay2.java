package DSA.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayDay2 {
    // refer to problem-1
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
}

/*

   int[] myArray = {1,2,3,4};

//        myArray[0] = 1;
//        myArray[1] = 2;
//        myArray[2] = 3;
//        myArray[3] = 4;

        for (int j : myArray) {
            System.out.println(j);
        }
        myArray[3] = 5;
        System.out.println("updated value here");
        for(int i=0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

 */