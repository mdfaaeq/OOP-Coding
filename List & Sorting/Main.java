interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}

class Main{
    public static void main(String[] args) {
        Shape s = new Circle(3);
        System.out.println(s.calculateArea());
        s = new Rectangle(2,4);
        s.calculateArea();
    }
}