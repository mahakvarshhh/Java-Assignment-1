import java.util.Scanner;

abstract class Payment {
    abstract void pay(int amount);
}

class CreditCardPayment extends Payment {
    void pay(int amount) {
        System.out.println("Processing credit card payment of " + amount);
        System.out.println("Credit card payment successful");
    }
}

class UPIPayment extends Payment {
    void pay(int amount) {
        System.out.println("Processing UPI payment of " + amount);
        System.out.println("UPI payment successful");
    }
}

public class Q10_abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter credit card amount:");
        int amount1 = sc.nextInt();

        System.out.println("Enter UPI amount:");
        int amount2 = sc.nextInt();

        CreditCardPayment c = new CreditCardPayment();
        UPIPayment u = new UPIPayment();

        c.pay(amount1);
        u.pay(amount2);
    }
}