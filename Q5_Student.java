public class Q5_Student {
    String name;
    int age;

    Q5_Student() {
        System.out.println("Default Constructor: Name: "+ name + " Age:" + age);
    }

    Q5_Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor: Name: " + name + " Age:" + age);
    }

    Q5_Student(Q5_Student s ) {
        this.name = s.name;
        this.age = s.age;
        System.out.println("Copy Constructor: Name: " + name + " Age:" + age);

    }

    public static void main(String[] args) {
        Q5_Student s1 = new Q5_Student();
        Q5_Student s2 = new Q5_Student("John",20);
        Q5_Student s3 = new Q5_Student(s2);
    }
}
