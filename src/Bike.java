public class Bike{
    private int age; // for readable we can add final to fixed the value that can't be changed
    private int price;
    private String color;

    Bike(int age, int price, String color){
        this.age = age;
        this.price = price;
        this.color = color;
    }

    int getAge(){
        return this.age;
    }
    String getPrice(){
        return "$" + this.price;
    }
    String getColor(){
        return this.color;
    }
    void setAge(int age){
        this.age = age;
    }
    void setPrice(int price){
        if(price < 0){
            System.out.println("Price cant be zero");
        }
        else{
            this.price = price;
        }
    }
    void setColor(String color){
        this.color = color;
    }
}
