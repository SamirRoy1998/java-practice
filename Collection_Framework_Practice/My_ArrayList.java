package pkg1.Collection_Framework_Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class My_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(7);
        al.add(27);
        al.add(28);
        al.addFirst(36);
        System.out.println("My ArrayList" + al);

        al.sort(Comparator.reverseOrder());
        System.out.println("Sorted" + al);
        Scanner sc = new Scanner(System.in);

        while (true) {
            int input = sc.nextInt();
            if (input > 0 && input <= al.size()) {
                int userInput = al.get(input - 1);
                System.out.println(userInput);
                break;
            } else System.out.println("Invalid input");
        }
    }
}
