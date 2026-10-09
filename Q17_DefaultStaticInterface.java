import java.util.Scanner;

interface MyShapeInterface {
    default void square() {
        System.out.println("Shape: Square");
    }

    default void triangle() {
        System.out.println("Shape: Triangle");
    }

    static void display() {
        System.out.println("Static method from interface");
    }
}

class ShapeExample implements MyShapeInterface {
}

public class Q17_DefaultStaticInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter shapes:");
        String a = sc.next();
        String b = sc.next();

        ShapeExample s = new ShapeExample();

        s.square();
        s.triangle();

        MyShapeInterface.display();

        sc.close();
    }
}