package pkg1.Java_Practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("1=Rock, 2=Paper, 3=Scissor");

        int myNum = sc.nextInt();
        int comNum = rn.nextInt(1, 4);
        System.out.println("Your num: " + myNum);
        System.out.println("System num: " + comNum);

        if (myNum > 0 & myNum < 4) {

            if (myNum == 1 & comNum == 2) {
                System.out.println("System win");
            } else if (myNum == 2 & comNum == 3) {
                System.out.println("System win");
            } else if (myNum == 3 & comNum == 1) {
                System.out.println("System win");
            } else if (myNum == 1 & comNum == 3) {
                System.out.println("You win");
            } else if (myNum == 3 & comNum == 2) {
                System.out.println("You win");
            } else if (myNum == 2 & comNum == 1) {
                System.out.println("You win");
            } else {
                System.out.println("Draw");
            }
        }
    }
}