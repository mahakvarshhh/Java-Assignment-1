import java.util.Scanner;
public class Q4_Calculator {

    Scanner sc = new Scanner(System.in);

    void add(int firstNumber, int secondNumber) {
        System.out.println("Enter First Integer Number:");
        firstNumber = sc.nextInt();
        System.out.println("Enter Second Integer Number:");
        secondNumber = sc.nextInt();
        System.out.println("Sum (int,int):  " + (firstNumber + secondNumber));
    }

    void add(double firstNumber,double secondNumber){
        System.out.println("Enter First Double Number:");
        firstNumber = sc.nextDouble();
        System.out.println("Enter Second Double Number:");
        secondNumber = sc.nextDouble();
        System.out.println("Sum (double,double): " + (firstNumber + secondNumber));
    }

    void add(int firstNumber,int secondNumber,int thirdNumber) {
        System.out.println("Enter First Integer Number:");
        firstNumber = sc.nextInt();
        System.out.println("Enter Second Integer Number:");
        secondNumber = sc.nextInt();
        System.out.println("Enter Third Integer Number:");
        thirdNumber = sc.nextInt();
        System.out.println("Sum (int,int,int): " + (firstNumber + secondNumber + thirdNumber));
    }

    public static void main(String[] args) {
        Q4_Calculator ca = new Q4_Calculator();
        ca.add(0,0);
        ca.add(0.0,0.0);
        ca.add(0,0,0);
    }
}

