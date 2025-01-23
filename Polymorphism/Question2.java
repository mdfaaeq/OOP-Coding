package Polymorphism;

class Animal {
    public void makeSound() { // Changed to public for proper overriding
        System.out.println("From Animal Class");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("From Dog Class");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("From Cat Class");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("From Cow Class");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound(); // Output: From Dog Class
        cat.makeSound(); // Output: From Cat Class
        cow.makeSound(); // Output: From Cow Class
    }
}
