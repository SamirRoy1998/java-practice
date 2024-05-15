package pkg1.Collection_Framework_Practice;

import java.util.ArrayList;

public class Compare_Two_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Keyboard");
        l1.add("Mouse");
        l1.add("Speaker");
        l1.add("Monitor");
        l1.add("Cpu");
        System.out.println(l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Monitor");
        l2.add("Mouse");
        l2.add("Keyboard");
        System.out.println(l2);

        ArrayList<String> l3 = new ArrayList<>();
        for (String e : l1) {
            if (l2.contains(e)) {
                l3.add("True");
            } else l3.add("False");
        }
        System.out.println(l3);
    }
}
