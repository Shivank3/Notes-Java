// base class
abstract class Car
{
   // constructor is needed then make it otherwise default in place inbuilt

    // abstract method
    abstract void show();
    // concrete method
    public void Display()
    {
        System.out.println("Car loading: " );
    }
}
// derived class
class wagonR extends Car{
    void show()
    {
        System.out.println("wagonR loading: " );
    }
//    void mock(){
//        System.out.println("wagonR showing: " );
//    }
}

public class abstract1 {
    public static void main(String[] args) {
        // Car c = new Car(); abstract class cannot be instantiated
        Car c1 = new wagonR();
        // reference type as car class and at runtime object is wagonR that means only run car class methods.
        c1.show();
        c1.Display();
        // c1.mock(); not allowed
    }

}
