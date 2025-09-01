public class GettersAndSetters {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modified
        // Getters = methods that make a field readable-> use when fields were private
        // Setters = methods that make a field writable-> use when fields were private

        Bike bike = new Bike(25, 2300,"orange");

        // bike.age = 20;  we won't be able to set value to age due to private methods
        // access through setter methods can set the fields
        bike.setAge(20);
        bike.setPrice(-2324);
        bike.setColor("red");

        System.out.println(bike.getAge() + " " + bike.getPrice() +" " + bike.getColor());
    }
}
