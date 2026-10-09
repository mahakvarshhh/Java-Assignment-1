import java.util.Scanner;

interface Readable {
    void read();
}

interface Writable {
    void write();
}

interface ReadableWritable extends Readable, Writable {
}

class Document implements ReadableWritable {
    public void read() {
        System.out.println("Reading Document...");
    }

    public void write() {
        System.out.println("Writing Document...");
    }
}

public class Q16_ExtendingInterfaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter document name:");
        String name = sc.next();

        Document d = new Document();

        d.read();
        d.write();
    }
}