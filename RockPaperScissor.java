package pkg1;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to ROCK PAPER SCISSOR GAME System VS You.\n1 = STONE, 2 = PAPER, 3 = SCISSOR\nNow enter what you want to pick: ");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("You have picked STONE.");
        }
        if (a == 2) {
            System.out.println("You have picked PAPER.");
        }
        if (a == 3) {
            System.out.println("You have picked SCISSOR.");
        }


        Random ran = new Random();

        int b = ran.nextInt(1, 4);
        switch (b) {
            case 1:
                System.out.println("System has picked STONE.");
                break;
            case 2:
                System.out.println("System has picked PAPER.");
                break;
            case 3:
                System.out.println("System has picked SCISSOR.");
                break;
        }


        if (a == 1 & b == 1) {
            System.out.println("THE GAME IS DRAW");

        } else if (a == 1 & b == 2) {
            System.out.println("SYSTEM IS WINNER");

        } else if (a == 1 & b == 3) {
            System.out.println("YOU ARE WINNER");

        } else if (a == 2 & b == 1) {
            System.out.println("YOU ARE WINNER");

        } else if (a == 2 & b == 2) {
            System.out.println("THE GAME IS DRAW");

        } else if (a == 2 & b == 3) {
            System.out.println("SYSTEM IS WINNER");

        } else if (a == 3 & b == 1) {
            System.out.println("SYSTEM IS WINNER");

        } else if (a == 3 & b == 2) {
            System.out.println("YOU ARE WINNER");

        } else if (a == 3 & b == 3) {
            System.out.println("THE GAME IS DRAW");
        }
    }
}