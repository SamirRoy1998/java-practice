package pkg1.Collection_Framework_Practice;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class My_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.offer(10);
        ll.offer(24);
        ll.offer(12);
        ll.offer(23);
        ll.offer(53);
        ll.offer(67);
        ll.push(99);
        System.out.println(ll);
        ll.sort(Comparator.reverseOrder());
        System.out.println(ll);

        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input > 0 && input <= ll.size()) {
                System.out.println(ll.get(input - 1));
                break;
            } else System.out.println("Invalid input");
        }
        LinkedList< Integer> ll2 = new LinkedList<>();
        ll2.add(43);
        ll2.add(23);
        ll2.add(11);
        ll2.add(36);
        ll2.add(22);
        ll2.add(26);

        LinkedList<String>ll3 =new LinkedList<>();
        for (Integer e:ll) {
            if (ll2.contains(e)) {
                ll3.add("True");
            } else ll3.add("False");
        }
        System.out.println(ll);
        System.out.println(ll2);
        System.out.println(ll3);
    }
}
