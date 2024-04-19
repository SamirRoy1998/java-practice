package pkg1;
import java.util.Scanner;
public class EnterYourName {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        System.out.println("Hello " + name + ". Welcome to Java Program 2024");
    }
}
