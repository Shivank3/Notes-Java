public class Methods {
    public static void main(String[] args){
        String name = "Shiva mangal";
        int age = 27;
//        happyBirthday(name,age);
//        happyBirthday(name, age);
        //double result = square(3);
        System.out.println(square(3));
    }

// methods -> it is a reusable code that is executed when called ().

    static void happyBirthday(String name, int age)
    {
        //String name = "Hello";
        System.out.println("Happy birthday to you:" + name);
        System.out.println("you are" + " " + age + " years old ");
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you");
    }

    static double square(double number){
        return number * number;
    }
}
