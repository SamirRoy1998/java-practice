package pkg1;

import java.util.*;

public class Collection_Framework {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(15);
        al.add(5);
        al.add(25);
        System.out.println("ArrayList: " + al);
        al.set(2, 20);
        System.out.println("ArrayList set: " + al);
        System.out.println();

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(7);
        ll.add(1);
        ll.add(25);
        System.out.println("LinkedList: " + ll);
        ll.set(2, 20);
        System.out.println("LinkedList set: " + ll);
        System.out.println("LinkedList pop (FIFO): " + ll.pop());
        System.out.println("LinkedList: " + ll);
        System.out.println();

        Vector<Integer> v = new Vector<>();
        v.add(2);
        v.add(1);
        v.add(22);
        v.add(30);
        System.out.println("Vector: " + v);
        v.set(1, 20);
        System.out.println("Vector set: " + v);
        System.out.println();

        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(36);
        s.push(28);
        s.push(10);
        System.out.println("Stack: " + s);
//        s.addLast(50);
        System.out.println("Stack pop (LIFO): " + s.pop());
        System.out.println("Stack: " + s);
        System.out.println();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(25);
        hs.add(2);
        hs.add(25);
        hs.add(10);
        hs.add(50);
        hs.add(36);
        System.out.println("HashSet (UnOrdered): " + hs);
        System.out.println();

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(25);
        lhs.add(2);
        lhs.add(25);
        lhs.add(10);
        lhs.add(50);
        lhs.add(36);
        System.out.println("LinkedHashSet (Ordered): " + lhs);
        System.out.println();

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(2);
        ts.add(25);
        ts.add(10);
        ts.add(50);
        ts.add(36);
        System.out.println("TreeSet: " + ts);
        System.out.println();

        PriorityQueue<Integer> pq_no = new PriorityQueue<>();
        pq_no.offer(10);
        pq_no.offer(25);
        pq_no.offer(36);
        pq_no.offer(2);
        pq_no.offer(10);
        // By default Java PriorityQueue has minimum value is in first order
        System.out.println("PriorityQueue Natural Order: " + pq_no);
        System.out.println("PriorityQueue Natural Order poll: " + pq_no.poll());
        System.out.println("PriorityQueue Natural Order poll: " + pq_no.poll());
        System.out.println("PriorityQueue Natural Order poll: " + pq_no.poll());
        System.out.println("PriorityQueue Natural Order poll: " + pq_no.poll());
        System.out.println("PriorityQueue Natural Order: " + pq_no);
        System.out.println();

        PriorityQueue<Integer> pq_ro = new PriorityQueue<>(Comparator.reverseOrder());
        pq_ro.offer(10);
        pq_ro.offer(25);
        pq_ro.offer(36);
        pq_ro.offer(2);
        pq_ro.offer(10);
        System.out.println("PriorityQueue Reverse Order: " + pq_ro);
        System.out.println("PriorityQueue Reverse Order poll: " + pq_ro.poll());
        System.out.println("PriorityQueue Reverse Order poll: " + pq_ro.poll());
        System.out.println("PriorityQueue Reverse Order poll: " + pq_ro.poll());
        System.out.println("PriorityQueue Reverse Order poll: " + pq_ro.poll());
        System.out.println("PriorityQueue Reverse Order: " + pq_ro);
        System.out.println();

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(36);
        ad.offerLast(30);
        ad.offerFirst(10);
        ad.offer(49);
        ad.offer(2);
        ad.offer(23);
        System.out.println("ArrayDeque: "+ad);
        System.out.println("ArrayDeque poll last: "+ad.pollLast());
        System.out.println("ArrayDeque: "+ad);
        System.out.println("ArrayDeque poll first: "+ad.pollFirst());
        System.out.println("ArrayDeque: "+ad);
        System.out.println(ad.remove(49));
        System.out.println(ad);
    }
}
