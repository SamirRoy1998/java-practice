package pkg1;
import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scnr1= new Scanner(System.in);
        System.out.println(scnr1.hasNextInt());
    }
}
