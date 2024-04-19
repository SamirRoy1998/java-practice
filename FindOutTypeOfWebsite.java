package pkg1;
import java.util.Scanner;

public class FindOutTypeOfWebsite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Website: ");

        String WebSite= sc.nextLine();
        if (WebSite.endsWith(".com")){
            System.out.println("Its a Commercial Website");
        }
        else if (WebSite.endsWith(".org")) {
            System.out.println("Its a Organisation Website");
        }
        else if (WebSite.endsWith(".in")) {
            System.out.println("Its a Indian Website");
        }
        else System.out.println("Cheating out of question LOL!!!!!");
    }
}
