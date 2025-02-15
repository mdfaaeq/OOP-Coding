enum Laptop{
    // Object(value)
    Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800), LOQ;
    private int price;

    Laptop() {
        price = 1000;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Enum2 {
    public static void main(String[] args) {
        Laptop laptop = Laptop.Macbook;
        System.out.println(laptop + " " + laptop.getPrice());
        System.out.println();
        for(Laptop l : Laptop.values()){
            System.out.println(l + " " + l.getPrice());
        }

    }
}
