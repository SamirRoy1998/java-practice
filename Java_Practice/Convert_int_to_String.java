package pkg1.Java_Practice;

import java.util.Scanner;

public class Convert_int_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = Integer.toString(num);
        System.out.println(name);

        String abc= "10001";
        int a = Integer.parseInt(abc);
        System.out.println(a);
        if (a == 10001){
            while (true){
                a++;
                System.out.println(a);
                break;
            }
        }

        String abcd = "101";
        double b =Double.parseDouble(abcd);
        System.out.println(b);
    }
}
