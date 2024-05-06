package pkg1;

class Example1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 50000) {
            System.out.println("Example1 meth1");
            i++;
        }
    }
}

class Example2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 50000) {
            System.out.println("Example2 meth1");
            i++;
        }
    }
}

public class Multi_Threads {
    public static void main() {
        Example1 e1 = new Example1();
        Example2 e2 = new Example2();
//        run without using threads
//        e1.run(); --> run first then
//        e2.run(); --> run this

//        run using threads
        e1.start();
        e2.start();
    }
}
