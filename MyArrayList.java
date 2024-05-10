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
        l1.add(0,10000);

//        for (int i=0; i< l1.size(); i++){
//            System.out.println(l1.get(i));
//        }
        System.out.println(l1);


        ArrayList<String> name = new ArrayList<>();
        name.add("Samir");
        name.add("Raja");
        name.add("Hari");

        name.add(1,"Susmita");

        name.set(2,"Rajen");

//        name.remove(3);
//        name.clear();

        System.out.println(name);
//        System.out.println(name.get(0));
//        for(int i=0; i<name.size();i++){
//            System.out.println(name.get(i));
//        }
//        System.out.println();
//        for (int i=name.size()-1; i>=0; i--){
//            System.out.println(name.get(i));
//        }

    }
}
