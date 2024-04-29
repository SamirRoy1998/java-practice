package pkg1;

class Class3 {
    int x;

    public Class3(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
class Class4 extends Class3{
    public Class4(int c) {
        super(c);
        System.out.println("I'm Class4's Constructor");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Class3 C3 = new Class3(5);
        Class4 C4 =new Class4(24);
        System.out.println(C3.getX());
    }
}
