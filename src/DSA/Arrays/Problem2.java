package DSA.Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem2 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        Iterator<Integer> newItr = list.iterator();
        newItr.forEachRemaining(element -> System.out.println(element));

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(1));
//        }
//
//        for(Integer i : list){
//            System.out.println("List of array: ");
//        }
    }
}
