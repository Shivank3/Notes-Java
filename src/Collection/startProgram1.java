package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class startProgram1 {

    public static void main(String[] args){

        // generics is used to generalise the type to help
        // Type safe collection -> same type of elements(objects) can be added to collection
        // unsafe type collection -> different type of objects can be added to collection

        // type safe collection
        ArrayList<String> obj = new ArrayList<>();
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
