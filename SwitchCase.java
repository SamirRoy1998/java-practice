package pkg1;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.print("Enter Day No: ");
        Scanner sc= new Scanner(System.in);
        int dayNo= sc.nextInt();

        switch (dayNo){
            case 1 -> System.out.println("Sunday \nPress Ctrl + F5 to Restart Program");
            case 2 -> System.out.println("Monday \nPress Ctrl + F5 to Restart Program");
            case 3 -> System.out.println("Tuesday \nPress Ctrl + F5 to Restart Program");
            case 4 -> System.out.println("Wednesday \nPress Ctrl + F5 to Restart Program");
            case 5 -> System.out.println("Thursday \nPress Ctrl + F5 to Restart Program");
            case 6 -> System.out.println("Friday \nPress Ctrl + F5 to Restart Program");
            case 7 -> System.out.println("Saturday \nPress Ctrl + F5 to Restart Program");

        }
    }
}
