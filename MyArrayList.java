package pkg1;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(52);
        l1.add(25);
        l1.add(38);
        l1.add(47);
        l1.add(65);
        l1.add(87);
        l1.add(74);
        l1.add(84);
        l1.add(94);
        l1.add(91);

        for (int i=0; i< l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
