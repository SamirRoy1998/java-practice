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
    }
}
