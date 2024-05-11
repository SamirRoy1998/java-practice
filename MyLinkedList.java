package pkg1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
//        LinkedList l1 = new LinkedList<>();
//        l1.add(10);
//        l1.add(25);
//        l1.add(20);
//        l1.add("Samir");
//        System.out.println(l1);
//        System.out.println(l1.get(0));
//        System.out.println(l1.get(3));
//
//        LinkedList <Double> l2 = new LinkedList<>();
//        l2.add(010.0);
//        l2.add(20.0);
//        l2.add(20.45);
//         double m1 =3.00;
//         for (int i = 0; i< l2.size(); i++){
//             l2.set(i,l2.get(i)*m1);
//         }
//        System.out.println(l2);
//        System.out.println(l1.get(3));

        LinkedList<Integer> a = new LinkedList<>();
        a.add(11);
        a.add(24);
        a.add(31);
        a.add(15);
        a.add(14);
        a.add(2,26);
        a.add(0,24);
        LinkedList<Integer> b = new LinkedList<>();
        b.add(1111);
        b.add(2451);
        b.add(3111);
        b.add(1511);
        b.add(1451);
//        b.add(2,2611);
//        b.add(0,2411);
//        b.remove(2);
//        b.clear();
        b.offer(22);
//        b.sort(Comparator.naturalOrder());
        System.out.println(b.peek());

//        b.addAll(a);
        System.out.println(a);
        System.out.println(b);
//        System.out.println(b.poll());
        System.out.println(b);

//        a.sort(Comparator.naturalOrder());
//         int m2 = 2;
//        System.out.println(a);
//         for (int i = 0; i< a.size();i++){
//             a.set(i,a.get(i)*m2);
//         }
//        System.out.println(a);
//        System.out.println(a.get(0));
//        System.out.println(a.get(1));
//        System.out.println(a.get(2));
//        System.out.println(a.get(3));
//        System.out.println(a.get(4));
//        System.out.println(a.get(5));
//        System.out.println(a.get(6));
    }
}
