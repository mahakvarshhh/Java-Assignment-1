import java.util.Scanner;
public class Q2_BankAccount {
    private int accountNumber;
    private float balance;
    float amount;
    float withdraw;

    Scanner sc = new Scanner(System.in);
    void set(){
        System.out.println("Enter Account Number:");
        accountNumber = sc.nextInt();
        System.out.println("Enter Balance:");
        balance = sc.nextFloat();
    }

    void deposit(){
        System.out.println("Deposit Amount:");
        amount = sc.nextFloat();
        balance = amount + balance;
        System.out.println("Deposit Successful. Current Balance:"+ balance );
    }

    void withdraw() {
        System.out.println("Enter Withdraw Amount:");
        amount = sc.nextFloat();
        if (balance > amount) {
            balance = balance - amount;
            System.out.println("Withdraw Successful.Remaning Balance:"+ balance );
        } else {
            System.out.println("Insufficient Balance ");
        }

    }


    public static void main (String[] args ) {
        Q2_BankAccount ba = new Q2_BankAccount();
        ba.set();
        ba.deposit();
        ba.withdraw();
    }

}
