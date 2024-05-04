package pkg1.Java_Practice;

class Circle {
    int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public double BaseArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    int height;

    public Cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double Volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class Circle_And_Cylinder {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(10, 20);
        Circle c = new Circle(10);
        System.out.println(c.BaseArea());
        System.out.println(cy.BaseArea());
        System.out.println(cy.Volume());
    }
}
