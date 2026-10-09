import java.util.Scanner;

class ObjectCounter {
    static int count = 0;

    ObjectCounter() {
        count++;
    }
}

public class Q12_static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of objects:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new ObjectCounter();
        }

        System.out.println("Number of objects created: " + ObjectCounter.count);
    }
}