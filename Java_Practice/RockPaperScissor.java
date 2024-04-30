package pkg1.Java_Practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("1=Rock, 2=Paper, 3=Scissor");

        int myNum = sc.nextInt();
        int comNum = rn.nextInt(1,4);

        if (myNum==1& comNum==2){
            System.out.println("");
        }
    }
}
