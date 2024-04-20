package pkg1;

public class loops {
    public static void main(String[] args) {
//-------------------------------------
//        WHILE LOOP (NOTE: WHILE LOOP fist check condition if condition false then exit loop
//                          or true then loop run unlit condition break otherwise loop run infinitely)
//-------------------------------------
//        int wl=0;
//        while (wl<=10){
//            System.out.println(wl);
//            wl++;
//        }

//        int wl = 10;
//        int wl1 = 0;
//        while (wl1 <= 10) {
//        while (wl >= 0) {
//                System.out.println(" 10 - " + wl1 + " = " + wl);
//                wl1++;
//                wl--;
//        }
//        }

//-------------------------------------
//        DO WHILE LOOP (NOTE: DO WHILE LOOP fist ENTER the DO SECTION and RUN DO SECTION then cheque condition if condition
//                             false then exit loop or true then loop run unlit condition break otherwise loop run infinitely)
//-------------------------------------
//        int wl=0;
//        do{
//            System.out.println(wl);
//            wl++;
//        }
//        while (wl<=10);

//        int wl=10;
//        do{
//            System.out.println(wl);
//            wl++;
//        }
//        while (wl<=7);

//        int wl = 6;
//        int wl1 = 1;
//        do {
//            System.out.println(" 5 + " + wl1 + " = " + wl);
//            wl1++;
//            wl++;
//        }
//        while (wl1 < 51);

//--------------------------------------
//        FOR LOOP (NOTE: FOR LOOP fist enter INITIALIZATION then check CONDITION and run to UP-TO-DATE SECTION
//                        then run program AND again check CONDITION until CONDITION false then exit loop)
//--------------------------------------
        for (int fl1=1; fl1<=10; fl1++){
            System.out.println(" 5 X "+ fl1+ " = "+ 5*fl1);
        }
        System.out.println("Decrementing Loop");
        for (int fl2=10; fl2>=1; fl2--){
            System.out.println(" 5 X "+ fl2+ " = "+ 5*fl2);
        }

//        int fl1=10;
//            System.out.println("Here is first 10 Odd numbers");
//        for (int i=0; i<fl1; i++) {
//            System.out.println(2 * i + 1);
//        }
//        int fl2=10;
//            System.out.println("Here is first 10 Even numbers");
//        for (int i=0; i<fl2; i++){
//            System.out.println(2*i);
//        }

//--------------------------------------


    }
}
