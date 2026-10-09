import java.util.Scanner;

public class Q1_Book {
    String title;
    String author;
    float price;

    void set() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Title:");
        title = sc.nextLine();

        System.out.println("Enter Author:");
        author = sc.nextLine();

        System.out.println("Enter Price:");
        price = sc.nextFloat();
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Q1_Book b1 = new Q1_Book();
        Q1_Book b2 = new Q1_Book();
        b1.set();
        b2.set();
        b1.display();
        b2.display();
    }
}




