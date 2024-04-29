package pkg1;

class Base1 {
    public Base1() {
        System.out.println("I'm Base1 class's Constructor");
    }

    public Base1(int x) {
        System.out.println("I'm Base1 class's Overloaded Constructor with value of x: " + x);
    }

}

class Derived1 extends Base1 {
    public Derived1() {
//        super(24);
        System.out.println("I'm Derived1 class's Constructor");
    }

    public Derived1(int x) {
        super(x);
        System.out.println("I'm also ");
    }

    public Derived1(int x, int y) {
        super(x);
        System.out.println("I'm Derived1 class's Overloaded Constructor with value of y: " + y);
    }
}

class ChildOfDerived1 extends Derived1 {
    public ChildOfDerived1() {
        System.out.println("I'm ChildOfDerived1 class's Constructor");
    }

    public ChildOfDerived1(int x) {
        super(x);
    }

    public ChildOfDerived1(int x, int y) {
        super(x, y);
    }

    public ChildOfDerived1(int x, int y, int z) {
        super(x, y);
        System.out.println("I'm ChildOfDerived1 class's Overloaded Constructor with value of z: " + z);
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
//        Base1 b =new Base1();

//        Derived1 d = new Derived1(24, 23);
//        new Derived1();
//        new Derived1(45);
//        new Derived1(24, 23);

        new ChildOfDerived1(22,24,27);
    }
}
