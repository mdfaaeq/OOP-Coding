class Vehicle{
    private String make;
    private String model;
    private int year;

    public void display_info(){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model; 
        this.year = year;
    }

}

class Car extends Vehicle{
    private int num_doors;

    public Car(String make, String model, int year, int num_doors){
        super(make, model, year);
        this.num_doors = num_doors;
    }

    public void display_car_info(){
        display_info();
        System.out.println(num_doors);
    }

}

public class Question1{
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Vitz", 2019, 5);
        car.display_car_info();
    }
}