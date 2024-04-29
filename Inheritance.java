package pkg1;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in Base class and i'm setting x");
        this.x = x;
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I'm in Derived class and i'm setting y");
        this.y = y;
    }
}

public class Inheritance {
    public static void main() {
        Base b = new Base();
        b.setX(40);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setY(50);
        d.setX(45);
        System.out.println(d.getY());
        System.out.println(d.getX());
    }
}
