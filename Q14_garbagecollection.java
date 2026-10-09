import java.util.Scanner;

class Garbage {
    protected void finalize() {
        System.out.println("Object destroyed");
    }
}

public class Q14_garbagecollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word:");
        String word = sc.next();

        Garbage obj = new Garbage();

        obj = null;

        System.gc();
    }
}