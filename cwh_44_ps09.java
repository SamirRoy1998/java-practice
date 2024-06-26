package pkg1;

class Cylinder1 {
    private int radius;
    private int height;

    public Cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangular1 {
    private int length;
    private int breadth;

    public Rectangular1() {
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere1 {
    private int radius;

    public Sphere1(int radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

}

public class cwh_44_ps09 {
    public static void main() {
        /*
        problem 1
        Cylinder1 cylinder = new Cylinder1();
        cylinder.setHeight(24);
        cylinder.setRadius(6);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());

        problem 2
        Cylinder1 cylinder = new Cylinder1();
        cylinder.setHeight(24);
        cylinder.setRadius(6);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());\

        problem 3
        Cylinder1 cylinder = new Cylinder1(6, 24);
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());

        problem 4
        Rectangular1 r = new Rectangular1();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        */
        //problem 5
        Sphere1 s = new Sphere1(5);
        System.out.println(s.volume());
        System.out.println(s.surfaceArea());
    }
}
