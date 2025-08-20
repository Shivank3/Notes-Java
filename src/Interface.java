public class Interface {
    public static void main(String[] args) {
        Iphone11 iphone = new Iphone12();
        System.out.println("Iphone 12 Specs: " );
        iphone.show();
        iphone.show();
        Iphone11 iphone2 = new Iphone13();
        System.out.println("Iphone 13 Specs: " );
        iphone2.show();
    }
}
interface Iphone11
{
    String s = "IOS 18";
    String s1 = "12MP camera";
    void show();
}
class Mac{
    public void Display(){
        System.out.println("Facetime");
    }
}
class Iphone12 extends Mac implements Iphone11
{
    // override
    public void show()
    {
        System.out.println(s);
        System.out.println("15MP camera");
        Display();
    }
}
class Iphone13 implements Iphone11
{
    // override
    public void show()
    {
        System.out.println("20MP camera");
        System.out.println(s);
    }
}

// interface implements to class
// iphone 11 feature can implement into iphone 12 and 13 with added new features
// it is used to make loosely coupled application which helps
// to do some changes at one place it will change at one place not at all
// abstract class supports abstract methods and concrete methods
// interface supports abstract methods
// interface does not allow constructor


