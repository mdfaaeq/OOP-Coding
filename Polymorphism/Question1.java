package Polymorphism;

class Shape{
    public double area(){
        return 0;
    }
}

class Rechtangle extends Shape{
    private double length;
    private double width;
    public Rechtangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}

public class Question1 {
    public static void main (String [] args){

        Rechtangle rechtangle = new Rechtangle(10, 5.7);
        System.out.println("Area of rechtangle : " + rechtangle.area());

        Circle circle = new Circle(4);
        System.out.println("Area of circle : " + circle.area());
    }
}
