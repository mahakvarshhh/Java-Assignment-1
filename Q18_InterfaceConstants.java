import java.util.Scanner;

interface Game {
    int MAX_PLAYERS = 11;
}

class Cricket implements Game {
    void display() {
        System.out.println("Game: Cricket, Max Players: " + MAX_PLAYERS);
    }
}

class Football implements Game {
    void display() {
        System.out.println("Game: Football, Max Players: " + MAX_PLAYERS);
    }
}

public class Q18_InterfaceConstants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter games:");
        String a = sc.next();
        String b = sc.next();

        Cricket c = new Cricket();
        Football f = new Football();

        c.display();
        f.display();
    }
}