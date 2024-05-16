package pkg1.Collection_Framework_Practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class My_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        p1.offer(10);
        p1.offer(42);
        p1.offer(67);
        p1.offer(11);
        p1.offer(42);
        p1.offer(72);
        p1.offer(78);
        p1.offer(84);
        p1.offer(95);
        p1.offer(52);
        System.out.println(p1);

        PriorityQueue<Integer> p2 = new PriorityQueue<>(Comparator.reverseOrder());
        p2.offer(10);
        p2.offer(42);
        p2.offer(67);
        p2.offer(11);
        p2.offer(42);
        p2.offer(72);
        p2.offer(78);
        p2.offer(84);
        p2.offer(95);
        p2.offer(52);
        System.out.println(p2);
    }
}
