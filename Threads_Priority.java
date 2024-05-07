package pkg1;

public class Threads_Priority extends Thread {
    int i = 0;
    public Threads_Priority(String name) {
        super(name);
    }

    @Override
    public void run()
    {
        while (i<10) {
            try {System.out.println("Hello " + this.getName());i++;
                Thread.sleep(2000);
                System.out.println("I'm Interrupted");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Threads_Priority t1 = new Threads_Priority("T1 Max");

        Threads_Priority t2 = new Threads_Priority("T2");
//        Threads_Priority t3 = new Threads_Priority("T3");
//        Threads_Priority t4 = new Threads_Priority("T4");
//        Threads_Priority t5 = new Threads_Priority("T5");
//        t1.setPriority(2);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.MIN_PRIORITY);
//        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start(); t2.start(); //t3.start(); t4.start(); t5.start();
//        System.out.println(t1.getPriority());
    }
}
