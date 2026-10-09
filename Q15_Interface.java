import java.util.Scanner;

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar...");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano...");
    }
}

public class Q15_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter instruments:");
        String a = sc.next();
        String b = sc.next();

        Guitar g = new Guitar();
        Piano p = new Piano();

        g.play();
        p.play();
    }
}