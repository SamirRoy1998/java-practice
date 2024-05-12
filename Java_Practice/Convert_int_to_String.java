package pkg1.Java_Practice;

import java.util.Scanner;

public class Convert_int_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = Integer.toString(num);
        System.out.println(name);
    }
}
