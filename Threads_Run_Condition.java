package pkg1;
class Counter { int count;
    public synchronized void increment() {count++;}}

public class Threads_Run_Condition {
    public static void main() throws InterruptedException {
        Counter c = new Counter();
        Runnable A = () -> {for (int i = 0; i < 1000000; i++)
        {c.increment();}
        };
        Runnable B = () -> {for (int i = 0; i < 1000000; i++)
        {c.increment();}
        };
        Thread a = new Thread(A);
        Thread b = new Thread(B);

        a.start();
        b.start();
        a.join();
        b.join();

        System.out.println(c.count);

    }
}
