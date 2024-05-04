package pkg1;

abstract class Base2{
    abstract void method1();}

abstract class Derived2 extends Base2{
    void method2(){System.out.println("I'm Method 2 in Derived 2 Class");}

    @Override
    void method1() {System.out.println("I'm method 1 in Base2 Class");}
}

class ChildOfDerived2 extends Derived2{
    void method3(){System.out.println("I'm Method 3 in Child of Derived 2 Class");}
}

public class Abstract_Class {
    public static void main(String[] args) {
        ChildOfDerived2 cd = new ChildOfDerived2();
        cd.method1();
        //Derived2 d = new Derived2(); -- error
    }
}
