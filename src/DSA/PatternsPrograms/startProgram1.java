package DSA.PatternsPrograms;

import java.util.ArrayList;
import java.util.Vector;

public class startProgram1 {

    public static void main(String[] args){

        // generics is used to generalise the type to help
        // Type safe collection -> same type of elements(objects) can be added to collection
        // unsafe type collection -> different type of objects can be added to collection

        // type safe collection
        ArrayList<String> obj = new ArrayList<>(); // parameterised generics method
        obj.add("Shiva");
        obj.add("mangal");
        obj.add("sm");
        // remove
        obj.remove("Shiva");

//        System.out.println(obj.get(0));
//        System.out.println(obj.get(1));

        // setting value
         obj.set(1, "ram");
         System.out.println(obj.contains("sm")); // true
        //obj.clear();
        System.out.println(obj);

        Vector<String> s = new Vector<>();
        s.addAll(obj);


        // untype safe
//        LinkedList list = new LinkedList();
//        list.add("Name");
//        list.add(23);
//        System.out.println(list);

    }
}

/*
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
 */