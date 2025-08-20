// default package private access modifier in class
public class Constructor
{
    // member variable
    int a, b;

    // no argument constructor
    // default package private specifier if no specifier assigned
    Constructor() {
        System.out.println("i am a Constructor");
    }

    // parameterised constructor
    Constructor(int a,  int b) {
        this.a =a;
        this.b =b;
    }

    Constructor(int a) {
        this.a = a;
        this.b = 40;
    }

    void Add() {
        System.out.println(a + b);
    }
}
class Test {
    public static void main(String[] args){
        Constructor c1;  // declare the object c but constructor only call in next line--> in defined object
        c1 = new Constructor(); // no argument constructor
        Constructor c2 = new Constructor(20,50); // parameterised constructor
        Constructor c3 = new Constructor(30);
        c2.Add();
        c3.Add();
    }
}

// default constructor if not assign in java
// Constructor overloading happening here