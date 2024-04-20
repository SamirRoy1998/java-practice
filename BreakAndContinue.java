package pkg1;
import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
//  -------------------------------------------------------------
//                      Example of BREAK LOOP
//  -------------------------------------------------------------
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Lighting Speed JAVA LIFT");
        System.out.print("Enter your floor no: ");

        int lift = sc.nextInt();
        int floor = 0;
        while (floor<=999999999){
            System.out.println(floor++);
            if (lift==floor){
                System.out.println(lift+" Your Destination Arrive");
                break;
            }
            if (floor==999999999){
                System.out.println(floor+" You are on the top floor of this building");
                break;
            }
        }

//  --------------------------------------------------------------
//                      Example of CONTINUE LOOP
//  --------------------------------------------------------------

//        System.out.println("Prime Number Unto 20 using CONTINUE LOOP:");
//        for (int i = 0; i < 20; i++) {
//            if (i == 0) {
//                continue;
//            }
//            if (i == 1) {
//                continue;
//            }
//            if (i == 4) {
//                continue;
//            }
//            if (i == 6) {
//                continue;
//            }
//            if (i == 8) {
//                continue;
//            }
//            if (i == 9) {
//                continue;
//            }
//            if (i == 10) {
//                continue;
//            }
//            if (i == 12) {
//                continue;
//            }
//            if (i == 14) {
//                continue;
//            }
//            if (i == 15) {
//                continue;
//            }
//            if (i == 16) {
//                continue;
//            }
//            if (i == 18) {
//                continue;
//            }
//            System.out.println(i);
//        }
//------------------------------------------------------------

    }
}
