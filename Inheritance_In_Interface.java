package pkg1;

interface Interface1 {
    void meth1();
    void meth2();
}

interface Interface2 extends Interface1 {
    void meth3();
    void meth4();
}

interface Interface3 extends Interface2 {
    void meth5();
    void meth6();
}

class MyClass implements Interface3 {

    @Override
    public void meth5() {
        System.out.println("meth5");
    }

    @Override
    public void meth6() {
        System.out.println("meth6");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }
}

public class Inheritance_In_Interface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        obj.meth5();
        obj.meth6();
    }
}
