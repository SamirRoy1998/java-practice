package pkg1;
import java.util.Random;
import java.util.Scanner;

class GuessGame{
    int noOfGuess;
    int comGenNum=0;

    Scanner sc = new Scanner(System.in);
    Random rn = new Random();

    public GuessGame(){
        comGenNum = rn.nextInt(101);
    }
    public int input(){
        System.out.print("Enter your number: ");
        int userInput = sc.nextInt();
        return userInput;
    }
    public void setNum(){
        noOfGuess++;
    }
    public void getNum(){
        System.out.print(noOfGuess);
    }
    public boolean isCorr(int userNum){
        int flag = 0;
        if (userNum>=0 && userNum<=101){
            setNum();
            if (userNum==comGenNum){
                System.out.println("Bravo! You Guess the right number: "+ userNum);
                flag = 1;
                sc.close();
            }
            else if (userNum>comGenNum) {
                System.out.println("Your number is bigger than System Generate number, Try Again.");
            }
            else if (userNum<comGenNum) {
                System.out.println("Your number is smaller than System Generate number, Try Again.");
            }
        }
        else {
            System.out.println("Enter a number between 0 to 100");
        }
        if (flag==0){
            return false;
        } else {
            return true;
        }
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        GuessGame mgame = new GuessGame();
        boolean pg=true;
        int uinput;
        while ( pg==true){
            uinput= mgame.input();
            boolean bl=mgame.isCorr(uinput);
            if (bl==true){
                System.out.print("You guess the number in ");
                mgame.getNum();
                System.out.println(" guesses");
                pg=false;
                break;
            }
            else {
                pg=true;
            }
        }
    }
}
