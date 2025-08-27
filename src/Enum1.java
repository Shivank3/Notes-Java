public class Enum1 {
    public static void main(String[] args)
    {
        // Laptop lap = Laptop.MackBook;
        // System.out.println(lap + " : " + lap.getPrice());
        for(Laptop laptop: Laptop.values())
        {
            System.out.println(laptop + "-" + laptop.getPrice());
        }
    }
}
enum Laptop{
    MackBook, Xps(2200), Surface, ThinkPad(4000);

    private int price;
    Laptop()
    {
        price = 1000;
    }
    Laptop(int price)
    {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
}
