import java.util.Locale;
import java.util.Scanner;
public class Q8_Vehicle {
    void start(){
        System.out.println("Vehicle Starting");
    }
}

class Car extends Q8_Vehicle {
    @Override
    void start(){
        System.out.println("Car Starting");
    }
}

class Bike extends Q8_Vehicle{
    @Override
    void start(){
        System.out.println("Bike Starting");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 Choice (Car/Bike):");
        String choice1 = sc.nextLine();

        switch(choice1.toLowerCase()) {
            case "car":
                Car c =new Car();
                c.start();
                break;

            case "bike":
                Bike b = new Bike();
                b.start();
        }
    }
}
