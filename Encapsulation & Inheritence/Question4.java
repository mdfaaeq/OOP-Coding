class Shape{
    public double area(){
        return 0;
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}

public class Question4 {
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(10, 5.6);
        System.out.println(rectangle.area());
        Circle circle = new Circle(12.3);
        System.out.println(circle.area());
    }
    
}
