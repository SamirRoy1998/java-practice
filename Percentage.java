package pkg1;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
//        System.out.println("Enter your Subject's Marks");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name= sc.next();
        System.out.print("Enter your exam's marks out of: ");
        int total= sc.nextInt();
        System.out.println("Your Marks in English subject?");
        float eng= sc.nextFloat();
        System.out.println("Your Marks in Bengali subject?");
        float ben= sc.nextFloat();
        System.out.println("Your Marks in Math subject?");
        float mth= sc.nextFloat();
        System.out.println("Your Marks in Social Science subject?");
        float ssc= sc.nextFloat();
        System.out.println("Your Marks in History subject?");
        float his= sc.nextFloat();
//        float sum= eng+ben+mth+ssc+his;
//        float db100= sum/500;
        float per=(eng + ben + mth + ssc + his)/5*100/total;
        System.out.print(name +" Your Percentage is ");
        System.out.println(per+ "%");
        if (per>=60) {
            System.out.println("Congratulation " + name + "! You obtain First Division");
        }
        else if (per>=45) {
            System.out.println("Try harder next time, " + name + "! You obtain Second Division");
        }
        else if (per>=30) {
            System.out.println("Focus in your study, " + name + "! You obtain Third Division");
        }
        else {
            System.out.println("Sorry!!! " + name + " You are FAIL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
