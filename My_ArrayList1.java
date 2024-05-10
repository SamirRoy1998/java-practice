package pkg1;

import java.util.ArrayList;
import java.util.Collections;

public class My_ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> batch_1 = new ArrayList<>();
        batch_1.add("Samir");
        batch_1.add("Raja");
        batch_1.add("Hari");
        batch_1.add("Gautam");
        batch_1.add("Abhinav");

        ArrayList<String> batch_2 = new ArrayList<>();
        batch_2.add("Rupa");
        batch_2.add("Anjali");
        batch_2.add("Anita");
        batch_2.add("Priya");
        batch_2.add("Anushka");

        batch_1.add(1,batch_2.get(4));
//        batch_1.add(3,batch_2.get(4));
        batch_2.remove(4);
        batch_1.addAll(batch_2);
        System.out.println(batch_1);
        Collections.sort(batch_1);
        System.out.println(batch_1);
        System.out.println(batch_1.indexOf("Samir"));

        ArrayList<String> cloneBatch1 =(ArrayList<String>)batch_1.clone();
        cloneBatch1.add("John");
//        Collections.sort(cloneBatch1);
        System.out.println(cloneBatch1);
//        System.out.println(batch_1);
//        System.out.println(batch_2);
    }
}
