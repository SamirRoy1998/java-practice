package pkg1.Java_Practice;

import java.util.Random;
import java.util.Scanner;

class game1 {
    int comNum;
    Random rn = new Random();
    Scanner sc = new Scanner(System.in);

    public game1() {

        comNum = rn.nextInt(1,4);
        System.out.println("1=Rock, 2=Paper, 3=Scissor");
    }

    public int userInput() {
        int userinput = sc.nextInt();
        System.out.printf("Your num: %d%n", userinput);
        return userinput;
    }

    boolean playGame(int myNum) {
        if (myNum > 0 & myNum < 4) {
            System.out.format("System num: %d%n", comNum);
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
                System.out.println("Match Draw");
            }
            return true;
        }
        else {
            System.out.println("Enter your Option 1,2,3 ");
        }
        return false;
    }
}

public class RockPaperScissor_with_methods {
    public static void main(String[] args) {
        game1 g = new game1();
        boolean pg = true;
        int userinput;
        while (pg == true) {
            userinput= g.userInput();
            boolean bl = g.playGame(userinput);
            if (bl == true) {
                pg = false;
                break;
            } else pg = true;
        }
    }
}
