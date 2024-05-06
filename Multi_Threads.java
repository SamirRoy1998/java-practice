package pkg1;

class Example1 {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Example1 meth1");
            i++;
        }
    }
}

class Example2 {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Example2 meth1");
            i++;
        }
    }
}

public class Multi_Threads {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        Example2 e2 = new Example2();
        e1.run();
        e2.run();
    }
}
