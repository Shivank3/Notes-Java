public class Abstract {
    public static void main(String[] args) {
        ApplePhone iphone = new Iphone1();
        System.out.println("Iphone 12 Specs: " );
        iphone.show();
        ApplePhone iphone2 = new Iphone2();
        System.out.println("Iphone 13 Specs: " );
        iphone2.show();
    }
}
abstract class ApplePhone
{
    String s = "IOS 18";
    String s1 = "12MP camera";
    abstract void show();
}
//class Mac{
//    void Show(){
//        System.out.println("Mac feature");
//    }
//} not able to extends in abstract class not support multiple inheritance

class Iphone1 extends ApplePhone
{
    // override
    public void show()
    {
        System.out.println(s);
        System.out.println("15MP camera");
    }
}
class Iphone2 extends ApplePhone
{
    // override
    public void show()
    {
        System.out.println("20MP camera");
        System.out.println(s);
    }
}
