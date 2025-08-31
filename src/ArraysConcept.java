import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args){

        // Arrays -> is a collection of values of the same data type
        //           and think of its variable that can store more than 1 value

        String[] fruits = {"Aanana","capaya","Biwi"};
        Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");
        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        //System.out.println(numOfFruits);

        //System.out.println(fruits[2]);
//        for(int i=0; i<fruits.length; i++){
//            System.out.println(fruits[i]);
//        }
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }
}
