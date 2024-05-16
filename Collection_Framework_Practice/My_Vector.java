package pkg1.Collection_Framework_Practice;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;

public class My_Vector {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        v1.add(24);
        v1.add(23);
        v1.add(69);
        v1.add(46);
        v1.add(43);
        v1.add(12);
        v1.add(12);
        System.out.println(v1);
        v1.sort(Comparator.reverseOrder());
        System.out.println(v1);

        Scanner sc = new Scanner(System.in);
        while (true) {
            int userInput = sc.nextInt();
            if (userInput > 0 && userInput <= v1.size()) {
                System.out.println(v1.get(userInput - 1));
                break;
            } else System.out.println("Invalid input");
        }
        Vector<Integer> v2 = new Vector<>();
        v2.add(24);
        v2.add(36);
        v2.add(28);
        v2.add(69);
        v2.add(11);
        v2.add(12);
        v2.add(27);
        v2.add(27);
        v2.add(95);
        v2.add(67);
        v2.add(73);

        Vector<String> v3 = new Vector<>();
//        for (int e : v1){
//            if (v2.contains(e)){
//                v3.add("T");
//            }else v3.add("F");
//        }

        Iterator i = v1.iterator();
        while (i.hasNext()){
            if (v2.contains(i.next())){
                v3.add("True");
            } else v3.add("False");
        }
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
