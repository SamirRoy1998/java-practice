package pkg1;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList<>();
        l1.add(10);
        l1.add(25);
        l1.add(20);
        l1.add("Samir");
        System.out.println(l1);
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

        LinkedList <Double> l2 = new LinkedList<>();
        l2.add(010.0);
        l2.add(20.0);
        l2.add(20.45);
         double m1 =3.00;
         for (int i = 0; i< l2.size(); i++){
             l2.set(i,l2.get(i)*m1);
         }
        System.out.println(l2);
//        System.out.println(l1.get(3));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
         int m2 = 2;
        System.out.println(a);
         for (int i = 0; i< a.size();i++){
             a.set(i,a.get(i)*m2);
         }
        System.out.println(a);
    }
}
