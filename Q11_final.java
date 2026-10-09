import java.util.Scanner;

final class FinalClass {
}

class Parent {
    final void display() {
        System.out.println("Cannot override final method");
    }
}

public class Q11_final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any two words:");
        String a = sc.next();
        String b = sc.next();

        final int value = 100;

        System.out.println("Final variable value: " + value);
        System.out.println("Cannot inherit from final class");

        Parent p = new Parent();
        p.display();
    }
}