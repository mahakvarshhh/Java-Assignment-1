class Base{
    Base(){
        System.out.println("Base Class Constructor Called");
    }
}
public class Q9_Derived extends Base{
    Q9_Derived(){
        System.out.println("Derived Class Constructor Called");
    }

    public static void main(String[] args){
        Q9_Derived dr = new Q9_Derived();
    }
}
