package pkg1;

class Example3 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Runnable 1");
            i++;
        }
    }
}

class Example4 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Runnable 2");
            i++;
        }
    }
}
class Example5 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Runnable 3");
            i++;
        }
    }
}
class Example6 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println("Runnable 4");
            i++;
        }
    }
}

public class Multi_Threads_implement {
    public static void main() {
        Example3 Bullet1 = new Example3();
        Thread gun1 = new Thread(Bullet1);

        Example4 Bullet2 = new Example4();
        Thread gun2 = new Thread(Bullet2);

        Example5 Bullet3 = new Example5();
        Thread gun3 = new Thread(Bullet3);

        Example6 Bullet4 = new Example6();
        Thread gun4 = new Thread(Bullet4);

        gun1.start();
        gun2.start();
        gun3.start();
        gun4.start();
    }
}
