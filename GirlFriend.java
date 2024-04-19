package pkg1;
import java.util.Scanner;

public class GirlFriend {
    public static void main(String[] args) {

        System.out.print("Enter Your Name: ");
        Scanner ScNm=new Scanner(System.in);
        String name=ScNm.nextLine();
//        System.out.print("Enter Your Age: ");
//        Scanner ScAg=new Scanner(System.in);


//        This is a switch

//        switch(name){
//            case "Samir":
//                System.out.println("Yes " + name + "! Fuck Me!!!");
//                break;
//            default:
//                System.out.println("Sorry! Go away");

//        This is an Enhanced Switch

        switch (name) {
            case "Samir" -> System.out.println("Yes " + name + "! Fuck Me!!!");
            default -> System.out.println("Sorry! Go away");
        }
    }
}
