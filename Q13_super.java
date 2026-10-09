import java.util.Scanner;

class MyParent {
    int value = 50;

    MyParent() {
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Parent method called");
    }
}

class MyChild extends MyParent {
    MyChild() {
        super();
    }

    void show() {
        super.display();
        System.out.println("Parent variable value: " + super.value);
    }
}

public class Q13_super{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word:");
        String word = sc.next();

        MyChild c = new MyChild();
        c.show();

        sc.close();
    }
}