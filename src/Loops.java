import java.util.*;

public class Loops {
    public static void main(String[] args)
    {
        /*
            Loop--> for loop, while loop, do-while loop, foreach loop
        */

        // while loop
        // runs until some condition changes dynamically
        int i; // initialisation
        i=10;
        while(i<=10) // condition
        {
            System.out.println(i);
            i++; // incremented
        }

        //for loop
        // uses mostly when counting run exactly 5 times
        for(i=1; i<=5; i++)
            System.out.println(i);

        // imp intQue
        for(i=1; i<=5; i++); // <-- print 6 because (i) defined globally
        {
            System.out.println(i);
        }

        // do while loop
        // uses for returning one condition either condition is satisfied or not.
        do
        {
            System.out.println(i); // must return value of (i).
            i++; // incremented
        }while(i<=2); // condition

        // for each loop
        // uses for show the list of city here
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Delhi");
        mylist.add("Mumbai");
        mylist.add("kanpur");
        mylist.add("goa");

        for(String s:mylist){
            System.out.println(s);
        }

        // nested loops also use we can do it in coding exercise soon will be attached
        for(i=0; i<=0; i--)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.println(j);
            }
        }
 }



}
