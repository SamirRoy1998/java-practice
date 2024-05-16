package pkg1.Collection_Framework_Practice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class My_Stack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(20);
        s1.push(12);
        s1.push(32);
        s1.push(62);
        s1.push(22);
        s1.push(12);
        s1.push(72);
        s1.push(74);
        s1.push(84);
        s1.push(15);
        s1.push(14);

        s1.sort(Comparator.reverseOrder());

        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input > 0 && input <= s1.size()) {
                System.out.println(s1.get(input - 1));
                break;
            } else System.out.println("Invalid input");
        }

        Stack<Integer> s2 = new Stack<>();
        s2.push(42);
        s2.push(11);
        s2.push(42);
        s2.push(74);
        s2.push(84);
        s2.push(48);
        s2.push(72);

        Stack<String> s3 = new Stack<>();
//        for (int e : s2) {
//            if (s1.contains(e)) {
//                s3.push(e+"True");
//            } else s3.push(e+"False");
//        }

        Iterator i=s2.iterator();
        while (i.hasNext()){
            if (s1.contains(i.next())){
                s3.push("True");
            }
            else s3.push("False");
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
