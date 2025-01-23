package Polymorphism;

abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is driving on the road.");
    }
}

class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("Bicycle is pedaling on the road.");
    }
}

class Airplane extends Vehicle {
    @Override
    void move() {
        System.out.println("Airplane is flying in the sky.");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bicycle(), new Airplane()};
        
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
