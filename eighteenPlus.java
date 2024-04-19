package pkg1;
import java.util.Scanner;
public class eighteenPlus {
    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        Scanner ScNm=new Scanner(System.in);
        String name=ScNm.nextLine();
        System.out.print("Enter Your Age: ");
        Scanner ScAg=new Scanner(System.in);
        int age=ScAg.nextInt();

        if (age>40) {
            System.out.println("Yes " + name + "! Let me Blow You first!!!");
        }
        else if (age>35) {
            System.out.println("Yes " + name + "! Fuck me harder Daddy!!!");
        }
        else if (age>25) {
            System.out.println("Yes " + name + "! Fuck me Baby!!!");
        }
        else if (age>17) {
            System.out.println("Yes " + name + "! Cum for me!!!");
        }
        else{
            System.out.println("Sorry! You can't Handel Me");
        }
    }
}

