public class Statickeyword {

    // static variable members
    static int a=10,b=20;
    int z=15;
    static int count = 0;
    Statickeyword()
    {
        System.out.println("i am a Constructor");
        count++;
    }
    static void Add() {
       System.out.println(a);
       System.out.println(b);
       //System.out.println(z); error
    }
    void Show() {
        System.out.println(z);
    }
    public static void main(String[] args) {
        Statickeyword.Add();
        Statickeyword st = new Statickeyword();
        Statickeyword st2 = new Statickeyword();
        st.Show();
    }
}

// System means class, out means object, println
// Static variables/methods can be called through class name (preferred) or objects
// A class can have both static and non-static members
// Static methods can directly access only static variables (for non-static, need an object)
// Static means it belongs to the class, not objects
// We use static for common/shared data; memory saving is a benefit
// Constructors are for objects, so static constructors are not allowed in Java
