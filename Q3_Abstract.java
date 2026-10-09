import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Circle Area: " + result);
    }

    void perimeter() {
        double result = 2 * Math.PI * radius;
        System.out.println("Circle Perimeter: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double result = length * width;
        System.out.println("Rectangle Area: " + result);
    }

    void perimeter() {
        double result = 2 * (length + width);
        System.out.println("Rectangle Perimeter: " + result);
    }
}

public class Q3_Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter circle radius:");
        double radius = sc.nextDouble();

        System.out.println("Enter rectangle length:");
        double length = sc.nextDouble();

        System.out.println("Enter rectangle width:");
        double width = sc.nextDouble();

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(length, width);

        c.area();
        c.perimeter();

        r.area();
        r.perimeter();

        sc.close();
    }
}
