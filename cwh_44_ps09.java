package pkg1;

class Cylinder1 {
    private int radius;
    private int height;

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

public class cwh_44_ps09 {
    public static void main() {
        /*
        problem 1
        Cylinder1 cylinder = new Cylinder1();
        cylinder.setHeight(24);
        cylinder.setRadius(6);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        */
        //problem 2
        Cylinder1 cylinder = new Cylinder1();
        cylinder.setHeight(24);
        cylinder.setRadius(6);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.surfaceArea());
        System.out.println(cylinder.volume());
    }
}
