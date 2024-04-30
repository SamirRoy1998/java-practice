package pkg1.Java_Practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main() {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("1=Rock, 2=Paper, 3=Scissor");

        int myNum = sc.nextInt();
        int comNum = rn.nextInt(1, 4);
        boolean condition=(myNum > 0 & myNum < 4);

        if (condition) {
            System.out.printf("Your num: %d%n", myNum);
            System.out.printf("System num: %d%n", comNum);
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
        }else {
            System.out.format("Incorrect move \nCtrl+F5 to restart");
        }
    }
}