package pkg1;

class Class5 {
    public int a() {
        return 4;
    }

    public void method2() {
        System.out.println("I'm Method2 of Class5");
    }
}

class Class6 extends Class5 {
    /*  This Override Annotate is Important,
    because if in case we change superclass Override method,
    then it shows error, and we can find where the problem is.
    Unless we can't find properly.  */
    @Override
    public void method2() {
        System.out.println("I'm Method2 of Class6");
    }

    public void method3() {
        System.out.println("I'm Method3 of Class6");

    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Class5 c5 = new Class5();
        c5.method2();

        Class6 c6 = new Class6();
        c6.method2();
    }
}
